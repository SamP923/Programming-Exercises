import java.io.*;
import java.util.*;

public class SongBinaryFileProcessor implements SongWriter, SongReader
{
	private String fileName;
	private DataInputStream fileReader;

	public SongBinaryFileProcessor( String fn )
	{
		fileName = fn;
		try
		{
			//used in the readSong method
			fileReader = new DataInputStream( new BufferedInputStream(
			   	     new FileInputStream( fileName ) ) );

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
			DataOutputStream out = new DataOutputStream( new BufferedOutputStream( new FileOutputStream( fileName, true ) ) );

			//cannot use only getSong method like in SongTextFileProcessor because the individual strings are required for the binary readSong method
			out.writeUTF( s.getTitle() );
			out.writeUTF( s.getArtist() );
			out.writeUTF( s.getGenre() );
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
		try
		{
			//gets the title/artist/genre based on lines and makes them into a song object
			return new Song( fileReader.readUTF(), fileReader.readUTF(), fileReader.readUTF() );
		}
		catch( IOException e )	
		{
			System.out.println( "IO Exception caught." );
			//something needs to be returned
			return null;
		}

	}//end readSong

	private String sam;

}//end class