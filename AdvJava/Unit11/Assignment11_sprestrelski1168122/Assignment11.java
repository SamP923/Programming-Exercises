import javafx.application.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.collections.*;
import java.text.DecimalFormat;

public class Assignment11 extends Application
{

	private TextField annualInterest;
	private TextField nOfYears;
	private TextField loanAmount;
	private TextField monthlyPay;
	private TextField totalPay;
	private double mP;
	

	public void start( Stage myStage )
	{
		// Stage and scene setup
		myStage.setTitle( "Loan Calculator" );
		GridPane rootNode = new GridPane();
		rootNode.setPadding( new Insets( 10 ) );
		rootNode.setHgap( 5 );
		rootNode.setVgap( 5 );

		rootNode.setAlignment( Pos.CENTER_LEFT );

		Scene myScene = new Scene( rootNode, 300, 200 );


		// creating textfields
		annualInterest = new TextField();
		nOfYears = new TextField();
		loanAmount = new TextField();
		monthlyPay = new TextField();
		totalPay = new TextField();


		//sets the outcome fields to uneditable
		monthlyPay.setEditable( false );
		totalPay.setEditable( false );


		// adds the labels and textfields to the gridpane
		rootNode.add( new Label( "Annual Interest Rate:"), 0, 0 ); rootNode.add( annualInterest, 2, 0 );
		rootNode.add( new Label( "Number of Years:" ), 0, 1 ); rootNode.add( nOfYears, 2, 1 );
		rootNode.add( new Label( "Loan Amount:" ), 0, 2 ); rootNode.add( loanAmount, 2, 2 );
		rootNode.add( new Label( "Monthly Payment:" ), 0, 3 ); rootNode.add( monthlyPay, 2, 3 );
		rootNode.add( new Label( "Total Payment:" ), 0 , 4 ); rootNode.add( totalPay, 2, 4 );


		// Calculate button and aligning
		Button calculateMe = new Button( "Calculate" ); rootNode.add( calculateMe, 2, 5 );
		rootNode.setHalignment( calculateMe, HPos.RIGHT );
		calculateMe.setOnAction( new CalculateHandler() );


		// shows the stage
		myStage.setScene( myScene );
		myStage.show();

	}//end start

	class CalculateHandler implements EventHandler<ActionEvent>
	{
		public void handle( ActionEvent e )
		{
			// used to change the Strings to doubles to make them calculatable (is that a word?)
			double i = Double.parseDouble( annualInterest.getText() );
			double a = Double.parseDouble( loanAmount.getText() );
			double n = Double.parseDouble( nOfYears.getText() );

			n *= -12; // used to change the exponent to negative and account for 12 months in a year
			i /= 12; // used to find monthly rate
			double holder = Math.pow( ( i + 1 ), n ); // in order to do the exponent work in the denominator of the payment equation
			mP = ( i * a ) / ( 1 - ( holder ) ); // calculates
			

			// used to cut off the extra decimals since the context is money
			DecimalFormat numberFormat = new DecimalFormat( "#.00" );
			n *= -1; // reverts the negative applied above since the total payment needs to be positive
			monthlyPay.setText( numberFormat.format( mP ) + " " );
			totalPay.setText( numberFormat.format( mP * n ) + " " );

		}//end handle

	}//end CalculateHandler

}//end Assignment11