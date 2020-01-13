import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

public class OnOffExercise extends Application
{

	Label text = new Label( "Push a Button" );
	Button on = new Button( "On" );
	Button off = new Button( "Off" );

	public void start( Stage myStage )
	{
		myStage.setTitle( "On/Off Exercise" );
		FlowPane rootNode = new FlowPane( 10, 10 );
		rootNode.setAlignment( Pos.CENTER );
	
		Scene myScene = new Scene( rootNode, 300, 200 );

		// Create a button
		
		

		// Register an Event Handler
		on.setOnAction( new OnButtonHandler() );
		off.setOnAction( new OffButtonHandler() );

		rootNode.getChildren().addAll( on, off, text );
		myStage.setScene( myScene );
		myStage.show();
	
	}

	class OnButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			//code to handle button press
			text.setText( "On button pushed" );
	
		}
	}

	class OffButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			//code to handle button press
			text.setText( "Off button pushed" );
	
		}
	}
}