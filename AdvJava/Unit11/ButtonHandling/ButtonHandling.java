import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

public class ButtonHandling extends Application
{

	private Button myButton;

	public void start( Stage myStage )
	{
		myStage.setTitle( "Button Handling" );
		FlowPane rootNode = new FlowPane( 10, 10 );
		rootNode.setAlignment( Pos.CENTER );
	
		Scene myScene = new Scene( rootNode, 300, 200 );

		// Create a button
		myButton = new Button( "Click me" );
		
		// Register an Event Handler
		myButton.setOnAction( new ButtonHandler() );

		rootNode.getChildren().addAll( myButton );
		myStage.setScene( myScene );
		myStage.show();
	
	}

	class ButtonHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			//code to handle button press
			myButton.setText( "Clicked" );
	
		}
	}
}