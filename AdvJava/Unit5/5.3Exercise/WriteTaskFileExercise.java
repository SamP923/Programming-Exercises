import java.io.*;
import java.util.*;

public class WriteTaskFileExercise
{
	public static void main( String [] args )
	{	
		Date [] dueDates = { new Date (3, 10, 2011 ),
				     new Date (2, 20, 2011 ),
				     new Date (3, 30, 2011 ) };

		String [] tasks = { "Do Java homework", 
				    "Get concert tickets", 
		 		    "Study for math test" };
	
		PrintWriter out = null;

		try
		{
			out = new PrintWriter(
			      new BufferedWriter(
			      new FileWriter( "tasks.txt" ) ) );
			
			for ( int i = 0; i < 3; i++ 
			{
				out.printf( "%5d %-30s %15s \n", ( i + 1 ),
					     tasks[ i ], dueDates[ i ].getDate() );
			}
		}
		catch ( IOException e )
		{
			System.out.println( "Writers not created" );
		}
		finally
		{
			out.close();
		}
		
		
	}
}