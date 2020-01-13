import java.io.*;
import java.util.*;

public class getStudentData
{
	public static void main( String [] args )
	{
		try
		{
			ObjectInputStream in = new ObjectInputStream(
					       new BufferedInputStream(
					       new FileInputStream( "students.dat" ) ));

			//reads the object from file and uses display method to show name and GPA
			for ( int i = 0; i < 3; i++ )
			{
				Student s = ( Student ) in.readObject();
				display( s );
			}

			in.close();

		}
 		catch ( Exception e )
 		{
			System.out.println( "IO Exception" );
		}

	}//end main

	public static void display( Student s )
	{
		System.out.println( "\nName: " + s.getName() + "\nGPA: " + s.getGPA() );
	}

}//end class