import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
public class AddingTextFields extends Application
{
	public void start( Stage myStage )
	{
		myStage.setTitle( "Adding a Text Field");
		FlowPane rootNode = new FlowPane();
		Scene myScene = new Scene( rootNode, 300, 200 );
		TextField textField1 = new TextField( "Here's some default text" );
		TextField textField2 = new TextField();
		rootNode.getChildren().addAll( textField1, textField2 );
		myStage.setScene( myScene );
		myStage.show();
	}
}