import java.util.*;

public class ArrayListExercise
{
	public static void main( String [] args )
	{
		ArrayList<GroceryItem> shortlife = new ArrayList<GroceryItem>();
		ArrayList<GroceryItem> longlife = new ArrayList<GroceryItem>();
		int shelfLife = 0;

		Random rng = new Random( 2018 );
			
		for( int i = 0; i < 50; i++ )
		{
			shelfLife = rng.nextInt( 30 ) + 1;
			GroceryItem grocery = new GroceryItem( ( i+ 1 ), shelfLife );
		
			if ( shelfLife > 7 )
				longlife.add( grocery );
			else
				shortlife.add( grocery );

		}

		System.out.println( "\nThere are " + shortlife.size() + " items with a short life." );
		display( shortlife );
		System.out.println( "\nThere are " + longlife.size() + " items with a long life." );
		display( longlife );
	}

	public static void display( ArrayList<GroceryItem> array )
	{
		for( GroceryItem grocery : array )
		{
			System.out.println( "Code: " + grocery.getCode() + "      Life: " + grocery.getLife() );
		}
	}
}