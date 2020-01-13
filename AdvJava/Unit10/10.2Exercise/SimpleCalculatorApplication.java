import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;public class SimpleCalculatorApplication extends Application
{
	private Label firstValueLabel;
	private Label secondValueLabel;
	private Label sumLabel;

	public void start( Stage myStage )
	{
		myStage.setTitle("Simple Calculator" );
		FlowPane rootNode = new FlowPane();
		Scene myScene = new Scene( rootNode, 300, 200 );
		firstValueLabel = new Label(  "First Value:    ");
		TextField tf1 = new TextField();
		secondValueLabel = new Label( "Second Value:   " );
		TextField tf2 = new TextField();
		sumLabel = new Label( "Sum is:         " );
		TextField tf3 = new TextField();
		tf3.setEditable( false );
		rootNode.getChildren(). addAll( firstValueLabel, tf1, secondValueLabel, tf2, sumLabel, tf3 );
		myStage.setScene( myScene );
		myStage.show();
	}
}