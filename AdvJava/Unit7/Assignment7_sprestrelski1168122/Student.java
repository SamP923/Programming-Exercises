import java.io.*;

public class Student implements Serializable
{
	private String name;
	private int SSN;
	private int coursenum;
	double [] grades;
	int [] credits;
	private double gpa;
	private int gp;

	public Student( String name, int SSN, int coursenum, double [] grades, int [] credits )
	{
		this.name = name;
		this.SSN = SSN;
		this.coursenum = coursenum;
		this.grades = grades;
		this.credits = credits;
	}

	public double getGPA()
	{
		//used to calculate gpa based using if statements for corresponding grade points
		for ( int i = 0; i < coursenum; i++ )
		{

			//could use a switch statement here but with ifelse statements, it works with a lower boundary only
			if ( grades[i] >= 90 )
			{	gp = 4; }
			else if ( grades[i] >= 80 )
			{	gp = 3; }
			else if ( grades[i] >= 70 )
			{	gp = 2;}
			else if ( grades[i] >= 60 )
			{	gp = 1; }
			else
			{	gp = 0; }

			gpa += gp;
		}
		
		gpa = gpa / coursenum;
			
		return gpa;
	}


	//set and get methods for all variables

	public String getName()
	{
		return name;
	}

	public void setName( String name )
	{
		this.name = name;
	}

	public int getSSN()	
	{
		return SSN;
	}

	public void setSSN( int SSN )
	{
		this.SSN = SSN;
	}
	
	public int getCourseNum()
	{
		return coursenum;
	}

	public void setCourseNum( int coursenum )
	{
		this.coursenum = coursenum;
	}

	public double [] getGrades()
	{
		return grades;
	}

	public void setGrades( double [] grades )
	{
		this.grades = grades;
	}

	public int [] getCredits()
	{
		return credits;
	}
	
	public void setCredits( int [] credits )
	{
		this.credits = credits;
	}
}