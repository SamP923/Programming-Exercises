class ProgrammingExercise
{
 	public static void main(String [] args)
 	{

			try
 			{
				tryit();
 			}
 			catch (ArithmeticException e)
 			{
 				System.out.println( "ArithmeticException caught" );
			}
 		finally
 		{
 			System.out.println( "Finally" );
 		}
 		
			System.out.println( "Method ending" );
 	}

	public static void tryit()
	{
		int i = 10;
		int j = 0;
		System.out.println( "Value is " + i/j );
	}
} 