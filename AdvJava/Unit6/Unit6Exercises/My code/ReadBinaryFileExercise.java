import java.io.*;
import java.util.*;

public class ReadBinaryFileExercise
{
	public static void main( String [] args )
	{

		DataInputStream in = null;
	
		try
		{
			in = new DataInputStream( new BufferedInputStream( 
			     new FileInputStream( "products" ) ) );

			while( in.available() > 0 )
			{
				int productNumber = 0;
				String name = "";
				int quality = 0;
				double cost = 0;

				productNumber = in.readInt();
				for( int j = 0; j < 15; j++ )
					name += in.readChar();

				quality = in.readInt();
				cost = in.readDouble();
			
				System.out.println( productNumber + name + quality + cost );
			}
			in.close();
		}
		catch( Exception e )
		{
			System.out.println("exception caught");
		}

		
			
	}
}
