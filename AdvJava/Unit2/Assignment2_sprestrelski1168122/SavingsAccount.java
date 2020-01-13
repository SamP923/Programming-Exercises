public class SavingsAccount extends Account
{
	
	double change;
	protected double withdrawFunds(double c)
	{
		change = c;
		boolean flag = false;
		
		System.out.println( "\nYour current balance is $" + balance + "." );

		//checks if the requested withdrawal is valid
		while(!flag)
			if ( balance >= change)
			{
				balance -= change;
				flag = true;
			} else
			{ 
				change = Input.getDouble( "\nNot enough funds. Please input a valid withdrawal.");
				flag = false;
			}
	
		
		System.out.println( "\nWithdrawal of $" + change );
		return balance;

	}//end withdraw

	public float getInterestRate()
	{
		interestRate = 0.06f;
		return interestRate;
	}//end method

}//end class