import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.collections.*;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import java.util.ArrayList;
import java.text.DecimalFormat;

public class FinalProject extends Application
{
		private TextField name;
		private TextField eMail;
		private RadioButton rbVisa = new RadioButton( "Visa " );
		private RadioButton rbMasterCard = new RadioButton( "MasterCard " );
		private RadioButton rbAmex = new RadioButton( "Amex " );
		private Label songsReceipt;
		private Label total;
		private String receipts = " ";
		private ListView<String> myListView = new ListView<String>();
		private ObservableList<String> selectedItems = myListView.getSelectionModel().getSelectedItems();
		
		public void start( Stage myStage )
		{
			myStage.setTitle( "eTunes Store" );

			FlowPane rootNode = new FlowPane();
			GridPane gridPane = new GridPane();
			FlowPane radioButtons = new FlowPane();
			FlowPane forButtons = new FlowPane();
			GridPane forLabels = new GridPane();

			// alignments and spacing
			rootNode.setPadding( new Insets( 10 ) );
			gridPane.setPadding( new Insets( 0, 0, 10, 0 ) );
			radioButtons.setPadding( new Insets( 0, 0, 10, 0 ) );
			forButtons.setPadding( new Insets( 10, 0, 20, 0 ) );
			gridPane.setHgap( 5 );
			gridPane.setVgap( 5 );	
			forButtons.setHgap( 280 );
			forLabels.setVgap( 10 );

			gridPane.setAlignment( Pos.TOP_LEFT );

			Scene myScene = new Scene( rootNode, 390, 430 );

			// creating textfields
			name = new TextField();
			eMail = new TextField();

			// listview
			ArrayList<Song> songList = new ArrayList<Song>();
		
			songList.add( new Song( "Carry On Wayward Son", "Kansas", 2.99 ) );
			songList.add( new Song( "Dream On", "Aerosmith", 1.99 ) );
			songList.add( new Song( "Hotel California", "Eagles", 3.99 ) );
			songList.add( new Song( "Immigrant Song", "Led Zeppelin", 0.99 ) );
			songList.add( new Song( "More Than a Feeling", "Boston", 0.99 ) );
			songList.add( new Song( "Paralyzer", "Finger Eleven", 1.99 ) );
			// Note: although you can directly add the songs with a fully formatted String, I thought it was cleaner and more organized
			// to create and use Song objects.

			// formatting and adding songs to the listview
			for( int i = 0; i < 6; i++ )
			{
				myListView.getItems().add( songList.get(i).getPrice() + "\t\"" +songList.get(i).getTitle() + "\" by " + songList.get(i).getArtist() );
			}

			myListView.setPrefSize( 380, 100 );
			myListView.getSelectionModel().setSelectionMode( SelectionMode.MULTIPLE );

			// radio buttons + togglegroup add
			ToggleGroup paymentG = new ToggleGroup(); //create a toggle group
			rbVisa.setToggleGroup( paymentG );
			rbMasterCard.setToggleGroup( paymentG );	
			rbAmex.setToggleGroup( paymentG );
		
			// adds the items to the gridpane
			gridPane.add( new Label( "Name:"), 0, 0 ); gridPane.add( name, 1, 0 );
			gridPane.add( new Label( "Email Address:" ), 0, 1 ); gridPane.add( eMail, 1, 1 );
		
			// uses a separate pane because the spacing is weird when in the same gridpane as the name and email	
			radioButtons.getChildren().addAll( new Label( "Form of Payment:  " ), rbVisa, rbMasterCard, rbAmex );

			// calculate + exit buttons, using a separate pane for spacing
			Button calculateMe = new Button( "Calculate" );
			Button exitMe = new Button( "Exit" );
			forButtons.getChildren().addAll( calculateMe, exitMe );

			// shopping cart label
			songsReceipt = new Label( "Your shopping cart contains: " );
			total = new Label( "Total: " );
			forLabels.add( songsReceipt, 0, 0 );
			forLabels.add( total, 0, 1 );

			// handles user selecting songs
			myListView.setOnMouseClicked( new EventHandler<Event>() 
			{
				public void handle( Event event )
				{
					String t = "Your shopping cart contains: ";	
					for( String each : selectedItems )
					{
						// this formats the String so the price and the artist are cut off - only the title remains
						each = each.split("\t")[1];
						each = each.split("by")[0];
						t = t + each + "\n";
						songsReceipt.setText( t );

					}//end for

				}//end handle
			});

			// adds panes + listview to the rootNode
			rootNode.getChildren().addAll( gridPane, radioButtons, myListView, forButtons, forLabels );
			exitMe.setOnAction( new ExitHandler() );
			calculateMe.setOnAction( new CalculateHandler() );

			// shows the stage
			myStage.setResizable( false );// leave my carefully done spacing alone!
			myStage.setScene( myScene );
			myStage.show();

		}//end start

		class ExitHandler implements EventHandler<ActionEvent>
		{
			public void handle( ActionEvent e )
			{
				// used to close the program
				Platform.exit();
				System.exit( 0 );	
				
			}//end handle

		}//end ExitHandler


		class CalculateHandler implements EventHandler<ActionEvent>
		{
			public void handle( ActionEvent e )
			{
				double cartTotal = 0;// declared down here in order to reset the price
				for( String each : selectedItems )
				{
					each = each.substring(0, 4);// cuts the String to just the price
					double songPrice = Double.parseDouble( each );// changes the type from a String to a double
					cartTotal += songPrice;
				}
				DecimalFormat numberFormat = new DecimalFormat( "#.00" );// used to cut off the extra decimals java likes to add
				total.setText( "Total: $" + numberFormat.format( cartTotal ) );

			}//end handle

		}//end CalculateHandler
				
}//end FinalProject