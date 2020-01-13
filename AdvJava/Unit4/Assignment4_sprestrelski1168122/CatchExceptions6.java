class CatchExceptions6
{
	public static void main( String [] args )
	{
		System.out.println();

		try 
		{ 
			divide( 10, 0 );
			//original division

		}//end try
		catch ( DivideByZeroException e )
		{
			boolean flag = false;
			
			//until a valid value is entered, the flag is false, prompting the user to try again
			while (!flag)
				try
				{
					int x = Input.getInt("Please enter a valid value." );
					divide( 10, x );
					flag = true;
				}//end try
				catch ( DivideByZeroException f )
				{
					System.out.println( "That is not a valid value." );

				}//end catch	

		}//end catch

		System.out.println( "End main().");
		
	}//end main method
	
	public static int divide( int x, int y ) throws DivideByZeroException
	{
		int result = 0;
		try
		{
			result = x / y;

		}//end try
		catch ( ArithmeticException e )
		{
			throw new DivideByZeroException( y );

		}//end catch
		return result;

	}//end divide()

}//end class