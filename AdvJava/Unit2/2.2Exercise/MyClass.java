public class MyClass
{
	private int x;
	private int y;
	
	public MyClass( int v1, int v2 )
	{
		x = v1;
		y = v2;
	}

	public String toString()
	{
		String result;
		result = getName() + " x = " + x + " y = " + y;
		return result;
	}
}
