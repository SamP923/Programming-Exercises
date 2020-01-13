import java.io.*;
import java.util.*;


//Is it bad form to use input and scanner in this assignment? Should I only use scanner in the future?
//On another note, should the file be a saved to a .txt file? I know that my program doesn't save to 
//a traditional .txt document, even though that's what the variable suggests. However, it's stil a 
//text document, and the assignment instructions don't mention anything, so I'm hoping it's alright.

public class Assignment5
{
	public static void main( String [] args )
	{
		String decision;
		String txtFileName;

		txtFileName = Input.getString( "File name?" );
		SongTextFileProcessor sProcessor = new SongTextFileProcessor( txtFileName );

		//tells the user where it's being saved
		System.out.println( "Songs saved under " + txtFileName );

			decision = Input.getString( "What would you like to do? Options: Add song (add), Display all songs (display), Quit the program (quit)" );

			switch( decision )
			{
				case "add":
					String title = Input.getString( "Title of the song?" );
					String artist = Input.getString( "Artist name?" );
					String genre = Input.getString( "Genre of the song?" );
					
					System.out.println( "You just added a new song! " + "\nTitle: " + title + "\nArtist: " + artist + "\nGenre: " + genre );
					
					//sends info to STFP to write a song to the file
					sProcessor.writeSong( new Song( title, artist, genre ) );
					break;
		
				case "display":
					try 
					{
						Scanner scan = new Scanner( new File( txtFileName ) );
		
						//while there are still lines left, keep reading. scan.nextLine()s to keep up with myScanner in the STFP class.
						while ( scan.hasNext() )
						{
							System.out.println( sProcessor.readSong() );
							scan.nextLine();
							scan.nextLine();
							scan.nextLine();
						}
						scan.close();
					}
					catch( Exception e )
					{ 
						System.out.println("I/O exception ocurred when opening file." );
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