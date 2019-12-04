using System;
using System.Collections.Generic;

class MainClass {
  public static void Main (string[] args) {
    Console.WriteLine ("Sam Prestrelski Unit 2 Advanced Assignments\n\n");

    /*
        ==============================
        Program 1: Fibonacci sequence
        ==============================  
    */
    Console.WriteLine("Program 1:\n");
    Console.WriteLine("What n of the Fibonacci sequence would you like?");
    int fib = Convert.ToInt32( Console.ReadLine() );
    
    int a = 0;
    int b = 1;

    for ( int j = 0; j < fib; j++)
    {
      int temp = a;
      a = b;
      b = temp + b;
    }
    Console.WriteLine( "The " + fib + postfixSel( fib ) + " number in the sequence is " + a );
    

    /*
        ==============================
        Program 2: Fibonacci function
        ==============================  
    */
    Console.WriteLine("\n\nProgram 2:\n");
    Console.WriteLine("What n of the Fibonacci sequence would you like?");
    int fib2 = Convert.ToInt32( Console.ReadLine() );
    Console.WriteLine( "The " + fib2 + postfixSel( fib2 ) + " number in the sequence is " + computeFibonacci( fib2 ));


    /*
        ==============================
        Program 3: Goldbach conjecture
        ==============================  
    */
    Console.WriteLine("\n\nProgram 3:\n");

    int userInput = 1;
    //checks if user entered an even number
    do{
        Console.WriteLine("Enter an even number!");
        userInput = Convert.ToInt32( Console.ReadLine() );
    } while ( userInput % 2 != 0);

    
    bool isPrime = true;
    List<int> primeList = new List<int>();
    //makes a list of all prime numbers from 1-n
    for (int i = 2; i <= userInput; i++){
        for (int j = 2; j <= userInput; j++){
            if (i != j && i % j == 0){
              isPrime = false;
              break;
            }
 
          }
          if (isPrime)
          {
            primeList.Add(i);
        }
        isPrime = true;
    }

    //checks if n - xprime = prime
    for (int k = 0; k < primeList.Count; k++)
    {
        int temp = userInput - primeList[k];
        bool yesPrime = checkPrime(temp);
        if ( yesPrime == true )
        {
            Console.WriteLine( "first prime was " + primeList[k] + "\nsecond prime was " + temp );
            break;
        }
    }
    
  }//end main


  public static int computeFibonacci( int n )
  {
    int i = 0;
    int j = 1;
    for ( int p = 0; p < n; p++ )
    {
      int temp = i;
      i = j;
      j = temp + i;
    }
    return i;
  }//end computeFibonacci()
  
  public static bool checkPrime( int x )
  {
    if (x <= 1) return false;
    if (x == 2) return true;
    if (x % 2 == 0) return false;

    var boundary = (int)Math.Floor(Math.Sqrt(x));

    for (int i = 3; i <= boundary; i+=2)
        if (x % i == 0)
            return false;

    return true;    
  }//end checkPrime()
  
  public static string postfixSel( int num ){
      string postfix = "th";
      if ( num > 20 || num < 10 )
      {
        switch( num % 10 )
        {
            case 1:
                postfix = "st";
                break;
            case 2:
                postfix = "nd";
                break;
            case 3: 
                postfix = "rd";
                break;
            default:
                break;
        }//end switch
      }//end if

      return postfix;

    }//end postfixSel()
  
}