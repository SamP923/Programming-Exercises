import java.io.*;

public class Contact implements Serializable
{

	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String email;

	public Contact( String ln, String fn, int pn, String ea )
	{
		firstName = fn;
		lastName = ln;
		phoneNumber = pn;
		email = ea;
	}

	//getter and setter methods for all variables
	public String getContact()
	{
		return lastName + ", " + firstName + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + email;
	}

	public String getFN()
	{
		return firstName;
	}

	public String getLN()
	{
		return lastName;
	}

	public String getFullName()
	{
		return lastName + ", " + firstName;
	}

	public int getPN()
	{
		return phoneNumber;
	}
	
	public String getEmail()
	{
		return email;
	}

	public void setFN( String fn )
	{
		firstName = fn;
	}
	
	public void setLN( String ln )
	{
		lastName = ln;
	}

	public void setPN( int pn )
	{
		phoneNumber = pn;
	}

	public void setEmail( String ea )
	{
		email = ea;
	}

}