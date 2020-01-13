import java.util.*;

public class TreeMapTest
{
	public static void main( String [] args )
	{
		TreeMap< String, String > products = new TreeMap< String, String >();
		
		products.put( "Hello", "Goodbye" );
		products.put( "World", "Earth" );
		products.put( "Bye", "Hi" );

		for ( Map.Entry product: products.entrySet() )
			System.out.println( product.getKey() + " : " + product.getValue() );
	
	}
}