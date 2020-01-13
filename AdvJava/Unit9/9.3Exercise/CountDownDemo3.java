public class CountDownDemo3
{
	public static void main( String [] args )
	{
		Thread threadOne = new CountDownEven();
		Thread threadTwo = new CountDownOdd();
		
		System.out.println();
		
		threadOne.start();
		threadTwo.start();
	}
}