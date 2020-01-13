import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.collections.*;

public class ListViewTest extends Application
{

	public void start( Stage myStage )
	{
		myStage.setTitle( "ListView" );
		FlowPane rootNode = new FlowPane( 10, 10 );
		Scene myScene = new Scene( rootNode, 300, 200 );

		ObservableList<String> choices = FXCollections.observableArrayList( "Item 1", "Item 2", "Item 3" );
		ListView<String> myListView = new ListView<String>( choices );
		myListView.getSelectionModel().setSelectionMode( SelectionMode.MULTIPLE );

		rootNode.getChildren().add( myListView );
		myStage.setScene( myScene );
		myStage.show();
	}
}