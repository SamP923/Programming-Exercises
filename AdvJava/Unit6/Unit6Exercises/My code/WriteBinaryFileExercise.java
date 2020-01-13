import java.util.*;
import java.io.*;

public class WriteBinaryFileExercise
{
	public static void main( String [] args )
	{
		int[] productNumber = { 110, 520, 178, 172 };
		String[] name = { "Hammer", "Lawn Mower", "Monkey Wrench", "Screwdriver" };
		int[] quantity = { 20, 8, 52, 150 };
		double[] cost = { 12.99, 79.52, 6.95, 5.99 };

		File f = new File( "products" );
		DataOutputStream out = null;

		try
		{

			out = new DataOutputStream( new BufferedOutputStream(
			      new FileOutputStream( f ) ) );

			for( int i = 0; i < 4; i++ )
			{
				out.writeInt( productNumber[i] );
				out.writeChars( name[i] );
				out.writeInt( quantity[i] );
				out.writeDouble( cost[i] );
			}
			System.out.println( "\n" + out.size() + "\n" );
		}
		catch ( IOException e )
		{
			System.out.println( "IO Exception caught." );
		}
	}			
}