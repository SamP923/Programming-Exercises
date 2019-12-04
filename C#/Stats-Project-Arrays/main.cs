using System;

class Assignment{
  
  //class variables
  private string aTitle;
  private double[] grades;
  private double classAvg;
  private double outOf;

  //default constructor for a Assignment object
  public Assignment(){
    string testTitle = "new class name";
    double[] testGrades = {78,90,88};
    outOf = 100;
    setATitle(testTitle);
    setGrades(testGrades);
  }
  
  
  //constructor with input for title and grades
  public Assignment(string title, double[] newGrades, double o){
    setATitle(title);
    setGrades(newGrades);
    setOutOf(o);
  }
  
  //methods to modify the class variables
  public void setATitle(string title){
    aTitle = title;
  }
  
  public void setGrades(double[] newGrades){
    grades = newGrades;
  }

  public void setOutOf( double o )
  {
    outOf = o;
  }
  
  //methods to access class variable values
  public string getATitle(){
    return aTitle;
  }
  
  public double[] getGrades(){
    return grades;
  }

  public double getOutOf(){
      return outOf;
  }

  public double calcAvg(){
      classAvg = 0;
      for ( int i = 0; i < grades.Length; i++){
          classAvg += grades[i];
      }
      classAvg = Convert.ToDouble( ( classAvg / grades.Length * 100 / outOf ).ToString("0.00"));
      return classAvg;
  }

  public double calcHighest(){
      double highest = 0;
      for ( int i = 0; i < grades.Length; i++){
          if ( grades[i] > highest)
            highest = grades[i];
      }
      return highest;
  }

  
}//end Assignment class

class MainClass {
  public static void Main (string[] args) {
    Console.WriteLine ("CURVE CALCULATOR\nsam prestrelski // @perhapsacat");
    Console.WriteLine();

    Assignment testGB = new Assignment();
    Assignment[] allGBs = new Assignment[1];
    allGBs[0] = testGB;

    string classAvg = testGB.calcAvg().ToString("0.000");
    Console.WriteLine( "class avg: " + classAvg );

    foreach( double grade in testGB.getGrades()){
        Console.WriteLine( grade );
    }

    string choice = "";
    do
    {
        //menu text
        Console.WriteLine("\n1) Create a new assignment and add it to the gradebook");
        Console.WriteLine("2) Modify an existing assignment");
        Console.WriteLine("3) Search for an assignment in the program array");
        Console.WriteLine("4) Print all assignment grades");
        Console.WriteLine("5) Curve the average on an assignment to a certain percentage");
        Console.WriteLine("6) Curve the average on an assignment by points");
        Console.WriteLine("7) Curve the average on an assignment to the highest grade");
        //Console.WriteLine("8) Delete an assignment");
        Console.WriteLine("Q) Quit\n\n");
        choice = Console.ReadLine();

        switch (choice){
            case "1":
                //assignment title, grades, outOf 
                Console.WriteLine("Enter the new assignment title: ");
                string aTitle = Console.ReadLine();
                Console.WriteLine("How many grades do you want to enter?");
                int amtGrades = Convert.ToInt32( Console.ReadLine() );
                double[] a = new double[amtGrades];

                Console.WriteLine("How many points is the assignment out of?");
                int outOf = Convert.ToInt32( Console.ReadLine() );

                Console.WriteLine("Enter the grades: ");
                int i = 0;
                foreach( double grade in a ){
                    a[i] = Convert.ToDouble( Console.ReadLine());
                    i++;
                }
                Assignment tempGradebook = new Assignment( aTitle, a, outOf );
                allGBs = addAssignment( tempGradebook, allGBs );

                break;
            case "2":
                Console.WriteLine("Which assignment do you want to modify?");
                int j = 1;
                foreach( Assignment b in allGBs )
                {
                    Console.WriteLine( j + ") " + b.getATitle() );
                    j++;
                }
                int temp2 = Convert.ToInt32( Console.ReadLine() ) - 1;

                //Console.WriteLine( allGBs[temp2].getATitle() );
                allGBs = modAssignment( temp2, allGBs[temp2], allGBs );
                break;
            case "3":
                Console.WriteLine("Which assignment do you want to look up?");
                string userinput = Console.ReadLine().ToUpper();
                findAssignment( userinput, allGBs );
                break;
            case "4":
                printGrades( allGBs );
                break;
            case "5":
                Console.WriteLine("Which assignment do you want to curve?");
                int k = 1;
                foreach( Assignment b in allGBs )
                {
                    Console.WriteLine( k + ") " + b.getATitle() );
                    k++;
                }
                int temp3 = Convert.ToInt32( Console.ReadLine() ) - 1;
                allGBs[temp3] = curveToAverage( allGBs[temp3] );
                break;
            case "6":
                Console.WriteLine("Which assignment do you want to curve?");
                int m = 1;
                foreach( Assignment b in allGBs )
                {
                    Console.WriteLine( m + ") " + b.getATitle() );
                    m++;
                }
                int temp4 = Convert.ToInt32( Console.ReadLine() ) - 1;
                allGBs[temp4] = curveToPoints( allGBs[temp4] );
                break;
            case "7":
                Console.WriteLine("Which assignment do you want to curve?");
                int n = 1;
                foreach( Assignment c in allGBs ){
                    Console.WriteLine( n + ") " + c.getATitle() );
                    n++;
                }

                int temp5 = Convert.ToInt32( Console.ReadLine() ) - 1;
                allGBs[temp5] = curveToHighest( allGBs[temp5] );
                break;
            default:
                break;
        }
    }while ( choice.ToUpper() != "Q");
  }//end main method

  public static Assignment[] addAssignment( Assignment newGradebook, Assignment[] grades ) {
      Assignment[] newGrades = new Assignment[grades.Length + 1];

      for( int i = 0; i < grades.Length; i++){
          newGrades[i] = grades[i];
      }

      newGrades[grades.Length] = newGradebook;

      return newGrades;
  }//end addAssignment

  public static Assignment[] modAssignment( int index, Assignment modGradebook, Assignment[] grades ) {
      string input;
      do{
          //menu
          Console.WriteLine("What do you want to do?");
          Console.WriteLine("1) Change assignment name");
          Console.WriteLine("2) Change all grades");
          Console.WriteLine("3) Add more grades");
          Console.WriteLine("Q) Quit");
          input = Console.ReadLine();
          int gLength = modGradebook.getGrades().Length;

          switch( input ){
              case "1":
                Console.WriteLine("Enter the new assignment name:");
                modGradebook.setATitle( Console.ReadLine() );
                break;
              case "2":
                Console.WriteLine("Enter the new grades:");
                int i = 0;
                double[] tempArray = new double[gLength];
                foreach( double c in modGradebook.getGrades() ){
                    tempArray[i] = Convert.ToDouble( Console.ReadLine() );
                    i++;
                }
                modGradebook.setGrades( tempArray );
                break;
              case "3":
                Console.WriteLine("How many grades do you want to add?");
                int j = Convert.ToInt32( Console.ReadLine() );
                double[] tempArray2 = new double[gLength + j];
                int k = 0;
                foreach( double d in modGradebook.getGrades() ){
                    tempArray2[k] = d;
                    k++;
                }

                while ( k < gLength + j )
                {
                    tempArray2[k] = Convert.ToDouble( Console.ReadLine() );
                    k++;
                }

                modGradebook.setGrades( tempArray2 );

                break;
              default:
                break;
          }
      }while ( input.ToUpper() != "Q");

      grades[index] = modGradebook;
      return grades;
  }//end modAssignment

  public static void  findAssignment( string userinput, Assignment[] grades ){
      bool sad = false;
      foreach ( Assignment a in grades ){
          if ( userinput == a.getATitle().ToUpper() )
          {
              Console.WriteLine("\nAssignment: " + a.getATitle() );
              foreach( double grade in a.getGrades() ){
                  double help = grade / a.getOutOf() * 100;
                  string temp = help.ToString("0.00");

                  Console.WriteLine( grade + "/" + a.getOutOf() + "\t" + temp + "%");
              }

              Console.WriteLine("\naverage: " + a.calcAvg() );
              sad = false;
              break;
          }//end if
          else
            sad = true;
      }

      if ( sad == true )
      {
        Console.WriteLine("Sorry, we couldn't locate your assignment! Did you type it in correctly?\n");
      }
  }

  public static void printGrades( Assignment[] grades ){
      foreach ( Assignment assignment in grades ){
          Console.WriteLine( "\nAssignment: " + assignment.getATitle() );
          foreach( double grade in assignment.getGrades() ){
            double help = grade / assignment.getOutOf() * 100;
            string temp = help.ToString("0.00");

            Console.WriteLine( grade + "/" + assignment.getOutOf() + "\t" + temp + "%");
          }
          Console.WriteLine( "\naverage: " + assignment.calcAvg());
      }
  }

  public static Assignment curveToAverage( Assignment curveThis){
      double[] averages = new double[curveThis.getGrades().Length];
      Console.WriteLine("The current average of this assignment is " + curveThis.calcAvg()+ "%" );
      Console.WriteLine("What do you want to curve the average to?");
      double curveAvg = Convert.ToDouble( Console.ReadLine() );
      curveAvg = curveAvg / curveThis.calcAvg();
      int i = 0;
      foreach ( double newGrade in curveThis.getGrades() )
      {
        double help = newGrade * curveAvg;
        double temp = Convert.ToDouble( help.ToString("0.00") );
        averages[i] = temp;
        i++;
      }

      curveThis.setGrades( averages );
      return curveThis;
  }

  public static Assignment curveToPoints( Assignment curveThis){
      Console.WriteLine("The current average of this assignment is " + curveThis.calcAvg() + "%. The assignment is out of " + curveThis.getOutOf() + "."  );
      Console.WriteLine("How many points do you want to curve it by?");
      double pointCurve = Convert.ToDouble( Console.ReadLine() );
      curveThis.setOutOf( curveThis.getOutOf() - pointCurve );

      return curveThis;

  }

  public static Assignment curveToHighest( Assignment curveThis ){
      double highest = curveThis.calcHighest();
      Console.WriteLine("The highest grade is " + highest.ToString("0.00") + " out of " + curveThis.getOutOf() + ". Are you sure you want to curve the assignment to this? (Y/N)");
      string yn = Console.ReadLine();
      if ( yn.ToUpper() == "Y" )
        curveThis.setOutOf(highest);
      else
        Console.WriteLine("Cancelled curve.");
      
      return curveThis;
  }
}//end MainClass