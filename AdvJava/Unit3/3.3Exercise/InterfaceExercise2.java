public class InterfaceExercise2
{
	public static void main( String [] args )	
	{
		DrawAndRotate[] drawableObjects = { new Cat(), new Boat(), new Square(), new PineTree() };

		System.out.println();
		
		for( int i = 0; i <4; i++ )
		{
			drawableObjects[i].draw();
			drawableObjects[i].rotate();
		}
	}
}