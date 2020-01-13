public class Findit extends Thread
{

	private int searchFor;
	private int begin;
	private int end;
	private boolean flag = false;

	public Findit( int searchFor, int begin, int end )
	{
		this.begin = begin;
		this.searchFor = searchFor;
		this.end = end;
		
	}

	public void run()
	{
		//broken when either the number is found or the thread limit is hit
		if(!flag)
		{
			for( int i = 0; i < 10; i++)
			{
				System.out.println( this.getName() + " Count is " + ( begin ) );
				if ( begin == searchFor ) 
				{
					System.out.println( "\nThe number was " + begin + ". \nNumber found by " + this.getName() +"!\n");
					begin = end + 1;//used so that it doesn't print this multiple times
					Thread.yield();
					flag = true;
				}
				else if ( begin == end  )
				{
					//so thread doesn't print over the designated limit
					System.out.println( "\nYou hit the limit of " + this.getName() + "\n");
					flag = true;
					Thread.yield();
				}
				else
				{
					begin += 1;
				}

				//makes output readable for user
				try
				{
					Thread.sleep( 100 );
				}
				catch( InterruptedException e )
				{}

			}//end for

		}//end if
		
	}//end run()

}//end class