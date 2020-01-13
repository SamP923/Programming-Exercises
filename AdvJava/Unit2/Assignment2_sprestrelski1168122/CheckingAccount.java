public class CheckingAccount extends Account
{
	public double withdrawFunds( double c )
	{
		double change = c;
		boolean flag = false;
		
		System.out.println( "Your current balance is $" + balance + "." );
		System.out.println( "Your overdraw limit is $100." );

		//checks if requested withdrawal is valid
		while(!flag)
			if ( balance >= change)
			{
				balance -= change;
				flag = true;

			} else if ( balance - change >= -100)
			{ 
				//overdraw
				String confirmation = Input.getString( "You are overdrawing your account. Are you sure you want to do this? Options: Confirm, Cancel.");
				if ( confirmation.equals( "Confirm" ) )
				{ balance -= change; 
				flag = true; }

				else { flag = false; }		
			} else
			{ 
				//too much money was requested
				change = Input.getDouble( "Value is past overdraw limit of $100. Please input a valid withdrawal.");
				flag = false;
			}//end if statement
		
		System.out.println( "\nWithdrawal of $" + change );
		return balance;

	}//end withdraw

	public float getInterestRate()
	{
		interestRate = 0.05f;
		return interestRate;
	}//end method

}//end class