public class CountDownDemo2
{
	public static void main( String [] args )
	{
		Thread threadOne = new Thread( new CountDownEven2() );
		Thread threadTwo = new Thread( new CountDownOdd2() );
		System.out.println();

		threadOne.start();
		threadTwo.start();
	}
}