using System;

class MainClass {
  public static void Main (string[] args) {
    //Title
    Console.WriteLine("Sam Prestrelski Unit 2 Assignments"+ "\n\n");
  
  
    //Program 1: in order
    Console.WriteLine("Program 1:\nEnter three integers!");
    int a = Convert.ToInt32(Console.ReadLine());
    int b = Convert.ToInt32(Console.ReadLine());
    int c = Convert.ToInt32(Console.ReadLine());
    string result = ( (a > b && b > c ) || (c > b && b > a )) ? "in order" : "not in order";
    Console.WriteLine( result );

    //Program 2: input age value
    Console.WriteLine("\n\nProgram 2:\nHow old are you?");
    int age = Convert.ToInt32( Console.ReadLine());
    string ageStatement = "";
    if ( age > 55 )
    {
      ageStatement = "you can retire";
    }
    else if ( age > 24 )
    {
      ageStatement = "you can rent a car";
    }
    else if ( age > 20 )
    {
      ageStatement = "you can gamble";
    }
    else if ( age > 17 )
    {
      ageStatement = "you can vote";
    }
    else if ( age > 16 )
    {
      ageStatement = "you can see an R rated movie";
    }
    else if ( age > 15 )
    {
      ageStatement = "you can drive";
    }
    else if ( age > 2 )
    {
      ageStatement = "you don't need diapers";
    }
    else
    {
      ageStatement = "how old are you really?";
    }
    Console.WriteLine( ageStatement + "\n\n");
    
    //Program 3: Calculator
    Console.WriteLine("Program 3:");
    Console.WriteLine("Enter any two numbers!");
    double i = Convert.ToDouble( Console.ReadLine() );
    double j = Convert.ToDouble( Console.ReadLine());
    Calculator rawrxd = new Calculator();
    Console.WriteLine( "Sum: " + rawrxd.sumNumbers(i,j) + 
      "\nDifference: " + rawrxd.diffNumbers(i,j) + 
      "\nProduct: " + rawrxd.prodNumbers(i,j) +
      "\nAverage: " + rawrxd.avgNumbers(i,j) +
      "\nMax: " + rawrxd.maxNumbers(i,j) +
      "\nMin: " + rawrxd.minNumbers(i,j) );
  }//end Main
}//end class

class Calculator{
    public double sumNumbers(double first, double second)
    {
      return first + second;
    }//end sumNumbers

    public double diffNumbers(double first, double second)
    {
      return Math.Abs( first - second);
    }//end diffNumbers

    public double prodNumbers(double first, double second)
    {
      return first * second ;
    }//end prodNumbers

    public double avgNumbers(double first, double second)
    {
      return (first + second )/2;
    }//end avgNumbers

    public double maxNumbers(double first, double second)
    {
      if ( first > second ) return first;
      return second;
    }//end maxNumbers

    public double minNumbers(double first, double second)
    {
      if ( first < second ) return first;
      return second;
    }//end minNumbers
    
  }//end Calculator