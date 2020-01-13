public class Assignment2
{
	public static void main( String [] args )
	{
		Account sAccount = new SavingsAccount();
		Account cAccount = new CheckingAccount();

		String cOrS;
		String wOrD;
		double change; 
		int changesToday;

		//asks for date
		int m; int d; int y;
			m = Input.getInt( "Enter the month." );
			d = Input.getInt( "Enter the day." );
			y = Input.getInt( "Enter the year.");
	
			Date smolDate = new Date(m, d, y);

		changesToday = Input.getInt( "How many withdrawals/deposits would you like to make today?" );

		for ( int i = 0; i < changesToday; i++)
		{
			cOrS = Input.getString( "What kind of account would you like to make changes to today? Options: Checking, Savings.");
			wOrD = Input.getString( "Options: Withdrawal, Deposit.");
			change = 0;
		
			if ( wOrD.equals("Withdrawal") )
			{
				change = Input.getDouble( "How much would you like to withdraw today?");
				
				if ( cOrS.equals("Checking"))
				{
					cAccount.withdrawFunds( change );
					
				} else if ( cOrS.equals("Savings"))
				{ 
					sAccount.withdrawFunds( change );

				} else
				{
					System.out.println("Not a valid account type.");

				}//end account checking

			} else if ( wOrD.equals("Deposit") )
			{
				change = Input.getDouble("How much would you like to deposit today?");
				if ( cOrS.equals("Checking"))
				{
					cAccount.depositFunds( change );

				} else if ( cOrS.equals("Savings"))
				{
					sAccount.depositFunds( change );

				} else
				{
					System.out.println("Not a valid account type.");

				}//end account checking

			} else
			{
				System.out.println("Not valid. Please choose Withdrawal or Deposit.");

			}//end type checking
	
			System.out.println( "You have made a " + wOrD + " to your " + cOrS + " account.");
		
		}//end for

		//printing values
		System.out.println( "\nChecking Account: " +"\nBalance: $" + cAccount.getBalance() + 
		"\nInterest Rate: " + String.format("%.2f", cAccount.getInterestRate()) + "%" +
		"\nAccount Number: " + cAccount.toString() + "\nCreated On: " + smolDate.getDate());
			
		System.out.println( "\nSavings Account: " + "\nBalance: $" + sAccount.getBalance() + 
		"\nInterest Rate: " + String.format("%.2f", sAccount.getInterestRate()) + "%" +
		"\nAccount Number: " + sAccount.toString() + "\nCreated On: " + smolDate.getDate());
	
	}//end main method

}//end class