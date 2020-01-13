public abstract class Account extends Assignment2
{
	protected int accountNumber;
	protected double balance;
	protected float interestRate;
	protected String dateCreated;
	protected double change;


	protected abstract double withdrawFunds(double c);

	protected double depositFunds(double c)
	{
		change = c;
		balance += change;
		System.out.println( "\nDeposit of $" + change );

		return balance;
	}//end deposit

	public void setAccountNumber( int an )
	{	
		accountNumber = an;
	}//end set an

	public int getAccountNumber()
	{
		return accountNumber;
	}//end get an

	public void setInterestRate( float ir )
	{	
		interestRate = ir;
	}//end set ir

	public float getInterestRate()
	{
		return interestRate;
	}//end get ir

	public void setBalance( double b )
	{
		balance = b;
	}//end set balance

	public double getBalance()
	{
		return balance;
	}//end get balance


}//end class