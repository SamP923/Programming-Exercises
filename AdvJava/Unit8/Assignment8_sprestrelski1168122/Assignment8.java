import java.util.*;
import java.io.*;

public class Assignment8
{
	public static void main( String [] args )
	{
		String decision;
		String fileName;
		String sam;
		boolean flag = false;
		fileName = Input.getString( "File name?" );

		TreeMap< String , Contact > contactList = new TreeMap< String, Contact>();

		//tells the user where it's being saved
		System.out.println( "Contacts saved under " + fileName );

		//only stops once user inputs quit
		while (!flag )
			{
				decision = Input.getString( "What would you like to do? Options: Add contact (add), Delete a contact (delete), Display contact list (display), Quit the program (quit)" );

				//user input 
				switch( decision )
				{
					case "add":
						String firstName = Input.getString( "First Name?" );
						String lastName = Input.getString( "Last Name?" );
						int phoneNum = Input.getInt( "Phone Number? Use only numbers, no dashes, please." );
						String email = Input.getString( "Email?" );
					
						System.out.println( "\nYou just added a new contact!\n" + lastName + ", " + firstName + "\nPhone Number: " + phoneNum + "\nEmail Address: " + email );
					
						//makes new contact and adds to treemap
						Contact contact = new Contact( lastName, firstName, phoneNum, email );
						contactList.put( lastName, contact );
						break;
		
					case "display":

						System.out.println( "\nDisplaying contact list." );
						try 
						{

							ObjectOutputStream out = new ObjectOutputStream(
									 	 new BufferedOutputStream(
										 new FileOutputStream( fileName ) ) );

							//array list for contacts, then adds contact objects from TreeMap
							ArrayList<Object> contactArr = new ArrayList<Object>();

							for ( Map.Entry c: contactList.entrySet() )
								contactArr.add( c.getValue() );

							//writes contacts to file
							for( int i = 0; i < contactList.size(); i++ )
								out.writeObject( contactArr.get(i) );

							out.close();


							ObjectInputStream in = new ObjectInputStream(
					   				       new BufferedInputStream(
					      				       new FileInputStream( fileName ) ));

							//reads contacts from file
							for ( int i = 0; i < contactList.size(); i++ )
							{
								Contact c = ( Contact ) in.readObject();
								display( c );
							}

							in.close();
						}
 						catch ( Exception e )
 						{
							System.out.println( "IO Exception" );
						}


						break;

					case "delete":
						//asks for the key (last name) in the TreeMap under where the contact is saved
						String ln = Input.getString( "What is the last name of the contact you would like to delete?" );
						Contact temporaryHolder = contactList.get( ln );
						System.out.println( "You are removing the contact for: " + temporaryHolder.getFullName() );
						contactList.remove( ln );
							
						break;

					case "quit":
						flag = true;
						break;	

					default:
						//if user does not match the four case sensitive options
						System.out.println("Not a valid option.");
						break;

				}//end switch
		
			}//end while
		
	}//end main

	public static void display( Contact c )
	{
		//used to format the printing of contacts                 yyyy
		System.out.println( "\nName: " + c.getFullName() + "\nPhone Number: " + c.getPN() + "\nEmail Address: " + c.getEmail() );
	}

}//end class