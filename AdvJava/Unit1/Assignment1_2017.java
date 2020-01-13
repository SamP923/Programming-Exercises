public class Assignment1
{
	public static void main( String [] args )
	{

		
		//LongDate date = new LongDate( m, y, d );

		Date [] dateArray = new Date[6];
		for ( int i = 0; i < 3; i++ )
		{
			int m; int d; int y;
			m = Input.getInt( "Enter the month." );
			d = Input.getInt( "Enter the day." );
			y = Input.getInt( "Enter the year.");
			dateArray[i] = new Date(m, d, y);

		}//end for
		
		//for ( int j = 3; j < 6; j++ )
		//{
			//String m; int d; int y;
			//m = Input.getString( "Enter the month." );
			//d = Input.getInt( "Enter the day." );
			//y = Input.getInt( "Enter the year.");
			//dateArray[j] = new LongDate( m, d, y);
		}//end for
		
		
		System.out.println( date.getDate() );

	}//end main method

}//end class