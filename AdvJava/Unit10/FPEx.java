import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class FPEx extends Application
{

	public void start( Stage myStage )
	{
		FlowPane rootNode = new FlowPane();
		rootNode.setPadding( new Insets( 30) ) ;
		rootNode.setHgap(5);
		rootNode.setVgap(5);

		Scene myScene = new Scene( rootNode, 330, 200 );

		rootNode.getChildren().addAll( new Label( "First Name:"), new TextField(), new Label("MI:") );

		TextField middleInitial = new TextField();

		middleInitial.setPrefColumnCount( 1 );

		rootNode.getChildren().addAll( middleInitial, new Label( "Last Name:"), new TextField() );

		myStage.setScene( myScene );
		myStage.show();
	}
}