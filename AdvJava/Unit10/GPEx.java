import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class GPEx extends Application
{
	public void start( Stage myStage )
	{
		GridPane rootNode = new GridPane();
		rootNode.setPadding( new Insets( 30 ) );
		rootNode.setHgap( 5 );
		rootNode.setVgap( 5 );

		Scene myScene = new Scene ( rootNode, 300, 200 );
	
		rootNode.add( new Label( "First Name:" ), 0 , 0 ); rootNode.add( new TextField(), 1, 0 );
		rootNode.add( new Label( "MI:" ), 2, 0 );
		TextField middleInitial = new TextField();
		middleInitial.setPrefColumnCount( 1 );
		rootNode.add( middleInitial, 3, 0 );
		rootNode.add( new Label( "Last Name:" ), 0, 1 ); rootNode.add( new TextField(), 1, 1 );

		myStage.setScene( myScene );
		myStage.show();
	}
}