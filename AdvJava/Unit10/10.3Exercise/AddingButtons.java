import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class AddingButtons extends Application
{
	public void start( Stage myStage )
	{
		myStage.setTitle( "Adding Toggle Buttons" );
		FlowPane rootNode = new FlowPane();
		rootNode.setAlignment( Pos.CENTER ); // center the controls in the scene
		Scene myScene = new Scene( rootNode, 300, 200 );
		Button myButton1 = new Button( "Button 1" );
		Button myButton2 = new Button( "Button 2" );
		
		rootNode.getChildren().addAll( myButton1, myButton2 );
		myStage.setScene( myScene );
		myStage.show();
	}
}