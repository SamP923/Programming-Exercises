import java.util.*;

public class eightpoint2
{
	public static void main( String [] args )
	{

		int shelfLife = 0;
		ArrayList<GroceryItem> shortLife = new ArrayList<GroceryItem>();
		ArrayList<GroceryItem> longLife  = new ArrayList<GroceryItem>();
		
		Random rn = new Random();

		for( int i = 0; i < 50; i++ )
		{
			shelfLife = rn.nextInt( 30 ) + 1;
			GroceryItem item = new GroceryItem( i + 1, shelfLife );
			
			if( shelfLife > 7 )
				longLife.add( item );
			else
				shortLife.add( item );
		}

		System.out.println( "There are " + shortLife.size() + " short-lived items:" );
 		display( shortLife );

		System.out.println( "There are " + longLife.size() + " long-lived items: " );
 		display( longLife ); 
	}

	public static void display( ArrayList<GroceryItem> array )
	{
		for( GroceryItem item : array )
			System.out.println( "code: " + item.getCode() + "        shelf life: " + item.getLife() );
		
	}

}