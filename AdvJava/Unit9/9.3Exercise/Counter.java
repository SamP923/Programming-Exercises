class Counter extends Thread
{
	public void run()
	{
		int count = 0;

		while( !isInterrupted() )
		{
			System.out.println( this.getName() + " Count is " + count );
			count++;

			try
			{
				Thread.sleep( 2000 );
			}
			catch( InterruptedException e )
			{
				break;
			}

		}

		System.out.println( "COUNTER INTERRUPTED" );
	}
}