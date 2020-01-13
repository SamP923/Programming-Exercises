public class Song
{
	private String title;
	private String artist;
	private String genre;

	public Song()
	{
		title = "";
		artist = "";
		genre = "";

	}//end song contructor 

	public Song( String t, String a, String g )
	{
		title = t;
		artist = a;
		genre = g;

	}//end song constructor with string args
	
	public String getSong()
	{
		return title + "\n" + artist + "\n" + genre;
	
	}//end getSong

	public void setTitle(String t)
	{
		title = t;

	}//end setTitle

	public void setArtist( String a )
	{
		artist = a;

	}//end setArtist

	public void setGenre( String g )
	{
		genre = g;
	
	}//end setGenre
	
	public String getTitle()
	{
		return title;

	}//end getTitle

	public String getArtist()
	{
		return artist;

	}//end getArtist
	
	public String getGenre()
	{
		return genre;
	
	}//end getGenre
	
	public String toString() 
	{
		//toString needs to be overridden or else there's a NullPointerException with the display in main method 
		//or it returns the actual reference hex to the Song object and we don't want that
		return  "\tSong: " + title +"\t\tArtist: " + artist + "\tGenre: " + genre;

	}//end toString 
	
}	