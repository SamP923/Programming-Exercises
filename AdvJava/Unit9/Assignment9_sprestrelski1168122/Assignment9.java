import java.util.*;

public class Assignment9
{
	public static void main( String [] args )
	{
		//sets up random number generator
		int numberToFind ;
		Random rng = new Random();

		numberToFind = rng.nextInt( 1001 ); //in order to have zero but also have 1000, you need to use 1001

		Thread threeFifty = new Findit( numberToFind, 0, 349);
		Thread sevenHundred = new Findit( numberToFind, 350, 699);
		Thread oneThousand = new Findit( numberToFind, 700, 1000);

		for( int i = 0; i < 35; i++ )
		{
			threeFifty.run();
			sevenHundred.run();
			oneThousand.run();

		}

	}	

}