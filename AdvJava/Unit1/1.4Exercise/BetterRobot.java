public class BetterRobot extends Robot
{

	String modelNumber; 

	public BetterRobot( String robotName, String nm)
	{
		super( robotName );
		modelNumber = nm;		
	}

	public void display()
	{
		super.display();
		System.out.println("My model number is " + modelNumber );
}
}