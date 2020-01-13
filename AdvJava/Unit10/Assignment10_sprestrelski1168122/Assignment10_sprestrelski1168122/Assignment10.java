// The command prompt has a different path than usual because I'm not on my own laptop. :)

import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class Assignment10 extends Application
{
	public void start( Stage myStage )
	{

		myStage.setTitle( "Loan Calculator" );
		GridPane rootNode = new GridPane();
		rootNode.setPadding( new Insets( 10 ) );
		rootNode.setHgap( 5 );
		rootNode.setVgap( 5 );

		rootNode.setAlignment( Pos.CENTER_LEFT );

		Scene myScene = new Scene( rootNode, 300, 200 );

		// adding labels and text fields
		// GridPane is used rather than FlowPane because the grid alignments make it easy to align the text fields,
		// whereas using FlowPane, trailing blanks can be finicky
		rootNode.add( new Label( "Annual Interest Rate:"), 0, 0 );
		rootNode.add( new TextField(), 2, 0 );
		rootNode.add( new Label( "Number of Years:" ), 0, 1 );
		rootNode.add( new TextField(), 2, 1 );
		rootNode.add( new Label( "Loan Amount:" ), 0, 2 );
		rootNode.add( new TextField(), 2, 2 );
		rootNode.add( new Label( "Monthly Payment:" ), 0, 3 ); 
		rootNode.add( new TextField(), 2, 3 );
		rootNode.add( new Label( "Total Payment:" ), 0 , 4 );
		rootNode.add( new TextField(), 2, 4 );

		// Calculate button and aligning
		Button aButton = new Button( "Calculate" ); rootNode.add( aButton, 2, 5 );
		rootNode.setHalignment( aButton, HPos.RIGHT );

		// shows the stage
		myStage.setScene( myScene );
		myStage.show();

	}
}