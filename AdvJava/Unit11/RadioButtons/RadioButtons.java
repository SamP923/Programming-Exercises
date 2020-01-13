import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

public class RadioButtons extends Application
{

	RadioButton aUSPSButton = new RadioButton( "USPS" );
	RadioButton aFEDEXButton = new RadioButton( "FedEx" );
	RadioButton aUPSButton = new RadioButton( "UPS" );
	RadioButton noButton = new RadioButton( "None" );

	Label text = new Label( "Select a shipping method" );

	public void start( Stage myStage )
	{

		myStage.setTitle( "Radio Buttons" );
		FlowPane rootNode = new FlowPane( 10, 10 );
		rootNode.setAlignment( Pos.CENTER );

		Scene myScene = new Scene( rootNode, 300, 200 );

		ToggleGroup myGroup = new ToggleGroup(); //create a toggle group

		//add buttons to the toggle group
		aUSPSButton.setToggleGroup( myGroup );
		aFEDEXButton.setToggleGroup( myGroup );
		aUPSButton.setToggleGroup( myGroup );
		noButton.setToggleGroup( myGroup );

		aUSPSButton.setSelected( true );
		aUSPSButton.setOnAction( new USPSHandler() );
		aFEDEXButton.setOnAction( new FEDEXHandler() );
		aUPSButton.setOnAction( new UPSHandler() );
		noButton.setOnAction( new NoHandler() );



		rootNode.getChildren().addAll( aUSPSButton, aFEDEXButton, aUPSButton, noButton, text);

		myStage.setScene( myScene );
		myStage.show();
	}

	class USPSHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			text.setText( "You have selected United States Postal Service" );
		}
	}

	class FEDEXHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			text.setText( "You have selected FEDEX" );
		}
	}

	class UPSHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			text.setText( "You have selected United Parcel Service" );
		}
	}

	class NoHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			text.setText( "No shipping required" );
		}
	}
}