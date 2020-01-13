public class ToString
{
	public static void main( String [] args )
	{
		MyClass obj = new MyClass(20, 30);
		MyClass obj2 = new MyClass(30, 40);
		
		
		System.out.println( obj.toString() );
		System.out.println( obj2.toString() );
	}
}