public class Customer
{
	private String name;
	private int waitTime;

	public Customer( String name, int waitTime )
	{
		this.name = name;
		this.waitTime = waitTime;
	}
	
	public String getName()
	{
		return name;
	}

	public int getWaitTime()
	{
		return waitTime;
	}

}