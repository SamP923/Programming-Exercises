import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;

public class TextFields extends Application
{
	public void start( Stage myStage )
	{
		myStage.setTitle("testing 123");
		FlowPane rootNode = new FlowPane();
		Scene myScene = new Scene( rootNode, 300, 200 );
		TextField textField1 = new TextField( "This is some default text." );
		textField1.setPrefColumnCount( 10 );
		TextField textField2 = new TextField();

		textField2.setText( "I love Java FX" );
		textField2.setEditable( false );
		TextField textField3 = new TextField();
		textField3.setPrefColumnCount( 20 );

		textField3.setPromptText( "Make sure you fill out this text field." );

		rootNode.getChildren().addAll( textField1, textField2, textField3 );
		myStage.setScene( myScene );
		myStage.show();


	}
}