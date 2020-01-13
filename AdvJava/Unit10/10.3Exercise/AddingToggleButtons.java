import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class AddingToggleButtons extends Application
{
	public void start( Stage myStage )
	{
		myStage.setTitle( "Adding Toggle Buttons" );
		FlowPane rootNode = new FlowPane( Orientation.VERTICAL );
		rootNode.setAlignment( Pos.CENTER ); // center the controls in the scene
		Scene myScene = new Scene( rootNode, 300, 200 );
		ToggleButton myToggleButton = new ToggleButton( "On/Off" );
		ToggleButton mtb2 = new ToggleButton( "asdasd" );
		
		rootNode.getChildren().addAll( myToggleButton, mtb2 );
		myStage.setScene( myScene );
		myStage.show();
	}
}