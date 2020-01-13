public class Assignment1
{
	public static void main( String [] args)
	{	
		//creates array for dates
		Date[] dateArray = new Date[6];

		for ( int i = 0; i < 3; i++) 
		{
			int m; int d; int y;
			m = Input.getInt( "Enter the month." );
			d = Input.getInt( "Enter the day." );
			y = Input.getInt( "Enter the year.");

			Date smolDate = new Date(m, d, y);
			dateArray[i] = smolDate;
			System.out.println( smolDate.getDate() );

			//adds 3 regular dates to the array

		}//end for
	
		for ( int j = 3; j < 6; j++)
		{
			String mld; int dld; int yld;
			mld = Input.getString( "Enter the month name. Capitalize the first letter." );
			dld = Input.getInt( "Enter the day." );
			yld = Input.getInt( "Enter the year.");
			
			LongDate longerDate = new LongDate(mld, dld, yld);
			dateArray[j] = longerDate;
			System.out.println( longerDate.getDate());

			//adds 3 long dates to the array

		}//end for

	}//end main method

}//end class