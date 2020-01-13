import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.collections.*;

public class ComboBoxes extends Application
{

	private Label myResponse;
	//create list of choices
	ObservableList<String> shippingChoices = FXCollections.observableArrayList( "US Postal Service", "FedEx", "UPS", "Airborne Express" );
		
	//create combo box
	ComboBox<String> shipping = new ComboBox<String>( shippingChoices );

	public void start( Stage myStage )
	{
		myStage.setTitle( "Combo Boxes" );
		FlowPane rootNode = new FlowPane( 10, 10 ); 
		rootNode.setAlignment( Pos.CENTER );
		Scene myScene = new Scene( rootNode, 300, 200 );

		
		myResponse = new Label( "Select a Shipping Method: " );
		shipping.setValue( "UPS" );
		shipping.setOnAction( new ComboBoxHandler() );
		shipping.setVisibleRowCount( 2 );

		rootNode.getChildren().addAll( shipping, myResponse );
		myStage.setScene( myScene );
		myStage.show();
	}

	class ComboBoxHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			myResponse.setText( "You selected " + shipping.getValue() );
		}
	}
}