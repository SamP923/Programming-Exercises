public class LongDate extends Date
{
	private String monthName;
	private int day;
	private int year; 

	public LongDate()
	{
		monthName = "";
		day = 0;
		year = 0;
	}

	public LongDate( String m, int d, int y)
	{
		monthName = editMonth(m);
		day = editDay(d);
		year = editYear(y);

	}//end LongDate

	public void setDate( String m, int d, int y )
	{
		monthName = editMonth(m);
		day = editDay(d);
		year = editYear(y);
	}

	public String getDate()
	{
		String s = (new StringBuilder()).append(monthName).append(" ").append(day).append(", ").append(year).toString();
		//builds the string (adding stuff)

		return s;
	
	}//end getDate
	
	public String getShortDate()
	{
		String s = (new StringBuilder()).append(monthName).append("/").append(day).append("/").append(year).toString();
		//builds the string
 
		return s;

	}//end getShortDate

	protected String editMonth(String m)
	{
		monthName = m;
		boolean flag = false; 
		while(!flag)
			if ( Character.isUpperCase( monthName.charAt(0)) == true) //checks if first character is capitalized
			{
				flag = true;//state of first char capitalization
			} else
			{
				//asks user for a capitalized first letter of String
				monthName = Input.getString("First letter must be capitalized.");

				flag = false; //state of first char capitalization
			}
		return monthName;

	}//end editMonth

	protected int editDay(int d)
	{
		int c = d;
		int dayNumber = 0;
		switch (monthName)
		{
			//checks month and assigns corresponding number of days in that month 
			case "January": case "March": case "May": case "July": case "August": case "October": case "December": 
				dayNumber = 31; break;
			case "February": 
				dayNumber = 28; break;
			case "April": case "June": case "September": case "November": 
				dayNumber = 30; break;
			
			default: System.out.println("An error occurred. Did you spell the month wrong?"); break;

		}

		boolean flag = false;
		while (!flag)
			if ( c >= 1 && c<= dayNumber )
			{
				flag = true;//state of validity of day number
			} else
			{
				//asks user for a valid number, adding the correct amount of days in the month to the String
				c = Input.getInt((new StringBuilder()).append("Day must be 1 - ").append(dayNumber).toString());
				
				flag = false; //state of validity of day number
			}
		
		return c;
		
	}//end editDay

}//end class