public class LongDate extends Date
{
	private String monthName;
	
	public LongDate( String m, int d, int y )
	{
		monthName = m;
		editDay( d );
		editYear( y );
	
	}//end LongDate

	public void setDate( String m, int d, int y )
	{
		monthName = m;
		editDay( d );
		editYear( y );		

	}//end setDate
	
	public String getDate()
	{
		return monthName + " " + getDay() + ", " + getYear();

	}//getDate

	public String getShortDate()
	{
		return super.getDate();

 	}//end shortDate

}//end class