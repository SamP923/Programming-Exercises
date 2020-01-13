import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;

public class CheckBoxes extends Application
{
	private CheckBox byMail;
	private CheckBox byEMail;
	private CheckBox noThanks;
	private Label response;
	private String receipts;

	public void start( Stage myStage )
	{
		myStage.setTitle( "Check Boxes" );
		FlowPane rootNode = new FlowPane( Orientation.VERTICAL );
		rootNode.setVgap( 5 ); 
		rootNode.setAlignment( Pos.CENTER );
		Scene myScene = new Scene( rootNode, 300, 200 );

		//create controls
		byMail = new CheckBox( "Mail" );
		byEMail = new CheckBox( "Email" );
		noThanks = new CheckBox( "No receipt needed" );
		Label myLabel = new Label( "How would you like to recieve your receipt?" );
		response = new Label(" " );
		
		// Register event handlers
		byMail.setOnAction( new MailHandler() );
		byEMail.setOnAction( new EMailHandler() );
		noThanks.setOnAction( new NoneHandler() );
	
		rootNode.getChildren().addAll( byMail, byEMail, noThanks, myLabel, response);
		myStage.setScene( myScene );
		myStage.show();	
	}

	public void showAll()
	{
		receipts = "Receipts will be sent via: ";
		if( byMail.isSelected() ) receipts += "Mail ";
		if( byEMail.isSelected() ) receipts += "Email ";
		if( noThanks.isSelected() ) 
		{
			byMail.setSelected( false );
			byEMail.setSelected( false );
			receipts = "Receipts will be sent via: No Receipt Needed ";
			
		}
		if( !byMail.isSelected() && !byEMail.isSelected() && !noThanks.isSelected() )
			receipts = "";

		response.setText( receipts );
	}
	
	class MailHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			//code to handle button press
			showAll();
	
		}
	}

	class EMailHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			//code to handle button press
			showAll();
	
		}
	}
	
	class NoneHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			//code to handle button press
			showAll();
	
		}
	}
}
