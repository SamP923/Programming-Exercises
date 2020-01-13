import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.collections.*;

public class ListViews extends Application
{

	private Label response;
	public void start( Stage myStage )
	{
		myStage.setTitle( "ListView" );
		FlowPane rootNode = new FlowPane( 10, 10 );
		Scene myScene = new Scene( rootNode, 300, 200 );

		ObservableList<String> choices = FXCollections.observableArrayList( "Item 1", "Item 2", "Item 3" );
		ListView<String> myListView = new ListView<String>( choices );
		myListView.setPrefSize( 100, 100 );
		myListView.getSelectionModel().setSelectionMode( SelectionMode.SINGLE );

		rootNode.getChildren().add( myListView, response );
		myStage.setScene( myScene );
		myStage.show();

		// add change listener using inner class as handler
		MultipleSelectionModel<String> selectionMod = myListView.getSelectionModel();
		selectionMod.selectedItemProperty().addListener( new ListViewHandler() );
	}

	class ListViewHandler implements ChangeListener<String>
	{
		public void changed( ObservableValue<? extends String> change, String oldVal, String newVal )
		{
			response.setText( newVal + " was selected" );
		}
	}
}