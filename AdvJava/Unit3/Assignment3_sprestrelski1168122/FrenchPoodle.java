public class FrenchPoodle extends Dog implements Sounds
{
	public void sound()
	{
		System.out.println( "Bonjour mon ami.");
	
	}//end sound
	
	public void sitUp()
	{
		System.out.println( "French Poodle sat up!");
	
	}//end situp

	public void lieDown()
	{
		System.out.println( "French Poodle lay down!");

	}//end liedown
	
	public void shakeHands()
	{
		System.out.println( "French Poodle shook your hand!");
		//trick specific to frenchpoodles (not included in inherited Dog class)

	}//end shakeHands
}//end class