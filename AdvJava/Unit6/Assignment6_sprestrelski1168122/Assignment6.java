import java.io.*;
import java.util.*;

public class Assignment6
{
	public static void main( String [] args )
	{
		String decision;
		String bFileName;
		String sam;

		bFileName = Input.getString( "File name?" );
		SongBinaryFileProcessor sProcessor = new SongBinaryFileProcessor( bFileName );

		//tells the user where it's being saved
		System.out.println( "Songs saved under " + bFileName );

			decision = Input.getString( "What would you like to do? Options: Add song (add), Display all songs (display), Quit the program (quit)" );

			switch( decision )
			{
				case "add":
					String title = Input.getString( "Title of the song?" );
					String artist = Input.getString( "Artist name?" );
					String genre = Input.getString( "Genre of the song?" );
					
					System.out.println( "You just added a new song! " + "\nTitle: " + title + "\nArtist: " + artist + "\nGenre: " + genre );
					
					//sends info to SBFP to write a song to the file
					sProcessor.writeSong( new Song( title, artist, genre ) );
					break;
		
				case "display":
					try 
					{
						DataInputStream in = new DataInputStream( new BufferedInputStream(
					     	    		     new FileInputStream( bFileName ) ) );

						//checks if there are more lines to read 
						while( in.readUTF() != null )
						{	
							System.out.println( sProcessor.readSong() );
							in.readUTF();
							in.readUTF();
						}
								
					}
					catch( IOException e )
					{ 
						sam = "sad";
					}
					break;

				case "quit":

					break;	

				default:
					//if user does not match the three case sensitive options
					System.out.println("Not a valid option.");
					break;

			}//end switch

	}//end main method

}//end class