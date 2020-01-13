import java.util.*;

public class LinkedListExercise
{
	public static void main( String [] args )
	{
		LinkedList<Customer> customerList = new LinkedList<Customer>();
		String name; 
		boolean flag = false;
		String decision;
		int servicetime;
	
		Random rng = new Random();
		while(!flag)
		{
			decision = Input.getString( "What would you like to do? Options: Add customer to queue (add), quit the program (quit)" );
			
			switch( decision)
			{
				case "add":
					name = Input.getString( "Name of the customer?" );
					servicetime = rng.nextInt( 20 ) + 1;
					
					Customer customer = new Customer( name, servicetime );
					customerList.addLast( customer );
					
					break;
				case "quit":
					flag = true;
					break;
				default:
					System.out.println( "ya fucked up but how" );
			}
		}			

		display( customerList );

	}//end main

	public static void display( LinkedList<Customer> array )
	{
		for( Customer customer : array )
		{
			System.out.println( customer.getName() + ", " + customer.getWaitTime() + " minutes");
		}

	}

}