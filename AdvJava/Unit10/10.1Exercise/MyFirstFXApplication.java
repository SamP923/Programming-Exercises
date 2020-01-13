import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;

public class MyFirstFXApplication extends Application
{
	public void start( Stage myStage )
	{
		myStage.setTitle("My First Java FX Application" );
		FlowPane rootNode = new FlowPane(); // create a root node to layout stuff
		Scene myScene = new Scene( rootNode, 300, 200 ); // create a scene: width, height 
		myStage.setScene( myScene );// set the scene on the stage
		myStage.show();// show the stage and it's scene

		myStage.setResizable( false ); //disable stage resizing
	}
	
	public static void main( String [] args )
	{
		launch( args );
	}
}
