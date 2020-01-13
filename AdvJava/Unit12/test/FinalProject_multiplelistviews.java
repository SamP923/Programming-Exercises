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

		public void start( Stage myStage )
		{
			myStage.setTitle( "eTunes Store" );

			FlowPane rootNode = new FlowPane();
			GridPane gridPane = new GridPane();
			FlowPane radioButtons = new FlowPane();
			FlowPane forButtons = new FlowPane();
			GridPane forLabels = new GridPane();

			rootNode.setPadding( new Insets( 10 ) );
			gridPane.setPadding( new Insets( 0, 0, 10, 0 ) );
			radioButtons.setPadding( new Insets( 0, 0, 10, 0 ) );
			forButtons.setPadding( new Insets( 10, 0, 20, 0 ) );
			gridPane.setHgap( 5 );
			gridPane.setVgap( 5 );	
			forButtons.setHgap( 280 );
			forLabels.setVgap( 10 );

			gridPane.setAlignment( Pos.TOP_LEFT );

			Scene myScene = new Scene( rootNode, 390, 350 );

			// creating textfields
			name = new TextField();
			eMail = new TextField();

			// listview
			
			ListView<String> songListView = new ListView<String>();
			ListView<String> cartListView = new ListView<String>();
			ArrayList<Song> songList = new ArrayList<Song>();
		
			songList.add( new Song( "Despacito", "Luis Fonsi", 2.99 ) );
			songList.add( new Song( "It Will Rain", "Bruno Mars", 1.99 ) );
			songList.add( new Song( "Sad!", "XXXTentacion", 0.99 ) );

			for( int i = 0; i < 3; i++ )
			{
				songListView.getItems().add( songList.get(i).getPrice() + "\t\t\"" + songList.get(i).getTitle() + "\" by " + songList.get(i).getArtist() );
			}

			songListView.setPrefSize( 380, 100 );
			songListView.getSelectionModel().setSelectionMode( SelectionMode.SINGLE );

			// add change listener using inner class as handler
			MultipleSelectionModel<String> selectionMod = songListView.getSelectionModel();
			selectionMod.selectedItemProperty().addListener( new ListViewHandler() );

			

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

			// adds panes + listview to the rootNode
			rootNode.getChildren().addAll( gridPane, radioButtons, songListView, forButtons, cartListView, forLabels );
			exitMe.setOnAction( new ExitHandler() );
			calculateMe.setOnAction( new CalculateHandler() );

			// shows the stage
			myStage.setResizable( false );
			myStage.setScene( myScene );
			myStage.show();

		}//end start

		class ListViewHandler implements ChangeListener<String>
		{
				public void changed( ObservableValue<? extends String> change, String oldVal, String newVal )
				{
					receipts += newVal;
					songsReceipt.setText( receipts );
				}
		}

		class ExitHandler implements EventHandler<ActionEvent>
		{
			public void handle( ActionEvent e )
			{
				Platform.exit();
				System.exit( 0 );	
				
			}
		}

		class CalculateHandler implements EventHandler<ActionEvent>
		{
			public void handle( ActionEvent e )
			{
			}
		}
				

}//end FinalProject