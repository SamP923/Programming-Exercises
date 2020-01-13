public class CastingExercise
{

	public static void main( String [] args )
	{
		Animal [] anArray = { new Chihuahua(), new Robin() };

		for( int i = 0; i < 2; i++ )
		{	
			if ( anArray[i] instanceof Robin )
			{
				((Robin) anArray[i] ).chirp();
			}else
			{
				System.out.println("Ya don't have a bird, mate.");
			}
		}
	
	}
}