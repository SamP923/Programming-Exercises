import java.util.Random;
//allows use of random number generator

public class Assignment3
{
	public static void main( String [] args )	
	{
		Sounds [] myAnimals = { new Chihuahua(), new FrenchPoodle(), new Robin(), new Bluebird() };
		//creates array with one of each animal

		Random r = new Random();
		int randomNum = r.nextInt(4);
		//generates the random number

		myAnimals[randomNum].sound();
		//invokes sound
		

	}//end main method

}//end class