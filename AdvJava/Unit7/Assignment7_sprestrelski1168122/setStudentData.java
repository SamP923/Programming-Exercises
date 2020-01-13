import java.io.*;
import java.util.*;

public class setStudentData
{
	public static void main( String [] args )
	{
		
		String name;
		int SSN;
		int coursenum;

		//makes array with 3 student objects
		Student [] sArray = new Student[3];

		for( int i = 0; i < 3; i++ )
		{
			name = Input.getString( "Name of student:" );
			SSN = Input.getInt( "Social security number of student:");
			coursenum = Input.getInt( "Number of courses completed by student:" );
			
			double [] grades = new double[coursenum];
			int [] credits = new int[coursenum];

			System.out.println( "\nName: " + name + "\nSSN: " + SSN + "\nNumber of courses: " + coursenum + "\n");

			//loop needed for input of courses
			for ( int j = 0; j < coursenum; j++ )
			{
				grades[j] = Input.getDouble( "Grade in course " + ( j + 1 ) );
				credits[j] = Input.getInt( "Credits received from course " + ( j + 1 ) );

				System.out.println( "Grade in course " + ( j + 1 ) + ": " + grades[j] );
			}

			//creates the student object from info
			Student student = new Student( name, SSN, coursenum, grades, credits );
	
			//adds the object to the array
			sArray[i] = student;

		}//end for

		try 
		{
			ObjectOutputStream out = new ObjectOutputStream(
					 	 new BufferedOutputStream(
						 new FileOutputStream( "students.dat" ) ) );

			//writes student objects to the array
			for( int i = 0; i < 3; i++ )
				out.writeObject( sArray[ i ] );

			out.close();
		}
		catch ( Exception e )
		{
			System.out.println( "Exception caught." );
		}

	}//end main

}//end class