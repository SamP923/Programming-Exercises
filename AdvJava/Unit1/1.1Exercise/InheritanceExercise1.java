public class InheritanceExercise1 
{
	public static void main( String [] args)
	{
		EvenBetterCube owo = new EvenBetterCube();
		
		owo.setSide(5);
		
		System.out.println( "Surface area = " + owo.getSurfaceArea());
		System.out.println( "Volume = " + owo.getVolume() );
		System.out.println( "Side area " + owo.getSideArea() );
	}
}