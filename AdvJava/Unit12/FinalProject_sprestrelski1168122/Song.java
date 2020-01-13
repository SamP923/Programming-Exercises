public class Song
{
	private String title;
	private String artist;
	private double price;

	public Song()
	{
		title = "";
		artist = "";
		price = 0;

	}//end song contructor 

	public Song( String t, String a, double p )
	{
		title = t;
		artist = a;
		price = p;

	}//end song constructor
	
	public String getSong()
	{
		return title + "\n" + artist + "\n" + price;
	
	}//end getSong

	public void setTitle(String t)
	{
		title = t;

	}//end setTitle

	public void setArtist( String a )
	{
		artist = a;

	}//end setArtist

	public void setPrice( double p )
	{
		price = p;
	
	}//end setPrice
	
	public String getTitle()
	{
		return title;

	}//end getTitle

	public String getArtist()
	{
		return artist;

	}//end getArtist

	public double getPrice()
	{
		return price;
	
	}//end getPrice

}//end Song
