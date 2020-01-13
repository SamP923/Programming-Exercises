import java.util.Scanner;

public class CountInterruptDemo
{
	public static void main( String [] args )
	{
		Thread counter = new Counter();
		System.out.println();
		counter.start();

		Scanner aScanner = new Scanner( System.in );
		String s = "";

		while( !s.equals( "stop" ) )
			s = aScanner.next();
		
		counter.interrupt();
	}
}

//need to type "stop" into the cmd
