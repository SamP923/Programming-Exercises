import java.io.*;
import java.util.*;
public class ReadWriteObjects
{
	public static void main( String [] args )
	{
		Product [] products = { new Product( 110, "Hammer ", 20, 12.99 ),
		new Product( 520, "Lawn Mower ", 8, 79.52 ),
		new Product( 178, "Monky Wrench ", 52, 6.95 ),
		new Product( 172, "Screwdriver ", 150, 5.99 )
		};
		
		try
		{
 			ObjectOutputStream out = new ObjectOutputStream(
						 new BufferedOutputStream(
						 new FileOutputStream( "objects.dat" ) ));

			for( int i = 0; i < 4; i++ )
			out.writeObject( products[ i ] );
			
			out.close();

			ObjectInputStream in = new ObjectInputStream(
					       new BufferedInputStream(
					       new FileInputStream( "objects.dat" ) ));
 			
			for( int j = 0; j < 4; j++ )
 			{
 				Product p = (Product) in.readObject();
 				display( p );
 			}
 			in.close();

 		}
 		catch ( Exception e )
 		{
			System.out.println( "IO Exception" );
		}
	}

	public static void display( Product p )
	{
		System.out.println( p.getProductCode() + "\t" +
		p.getProductDescription() + "\t" +
		p.getProductQuantity() + "\t" +
		p.getProductCost()
		);
	}
} 