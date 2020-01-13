import java.io.*;
import java.util.*;

public class SongTextFileProcessor implements SongWriter, SongReader
{
	private String fileName;
	private Scanner myScanner;

	public SongTextFileProcessor( String fn )
	{
		fileName = fn;
		try
		{
			myScanner = new Scanner( new File( fileName ) );
			//needs fileName assignment 

		}//end try
		catch( Exception e )
		{
			sam = "sad";

		}//end catch

	}//end STFP constructor

	public void writeSong( Song s )
	{
		try
		{
			//writes the song to the file using user input from main method for the getSong method
			PrintWriter out = new PrintWriter( new BufferedWriter( new FileWriter( fileName, true ) ) );
			out.println( s.getSong() );
			out.flush();
			out.close();

		}//end try
		catch( IOException e )
		{
			System.out.println("I/O Exception caught.");

		}//end catch

	}//end writeSong
		
	public Song readSong()
	{		
		//gets the title/artist/genre based on lines and makes them into a song object
		return new Song( myScanner.nextLine(), myScanner.nextLine(), myScanner.nextLine() );

	}//end readSong

	private String sam;
}//end class