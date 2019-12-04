using System;

class MainClass {
  public static void Main (string[] args) {
    //Title
    Console.WriteLine("Sam Prestrelski Unit 1 Assignments"+ "\n\n");

    //Program 1: Print Name
    Console.WriteLine("Program 1");
    Console.WriteLine(" _________________");
    Console.WriteLine("| Sam Prestrelski |");
    Console.WriteLine(" ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞ ͞"+ "\n\n");

    //Program 2: Print an Image
    Console.WriteLine("Program 2");
    Console.WriteLine(@"      |\__/,|   (`)");
    Console.WriteLine("    _.|o o  |_   ) )");
    Console.WriteLine("---(((---(((---------" + "\n\n");

    //Program 3: American Flag
    Console.WriteLine("Program 3");
    for ( int i = 0; i<4;i++)
    {
      Console.WriteLine("* * * * * * ========================");
      Console.WriteLine(" * * * * *  ========================");
    }
    Console.WriteLine("* * * * * * ========================");
    for ( int i = 0; i<5; i++)
    {
      Console.WriteLine("====================================");
    }
    Console.WriteLine("\n\n");

    //Program 4: Variable Declaration + Output
    Console.WriteLine("Program 4");
    byte byteVar = 255;
    int intVar = 100;
    float floatVar = 10.2f;
    double doubleVar = 17.6;
    char charVar = 'A';
    bool boolVar = true;
    Console.WriteLine( "Byte: " + byteVar +"\nInt: " + intVar +"\nFloat: " + floatVar +"\nDouble: " + doubleVar + "\nChar: " + charVar +"\nBoolean: " + boolVar +"\n\n");

    //Program 5: User Input Vars
    Console.WriteLine("Program 5");
    Console.WriteLine( "Byte: " );
    byte byteVar2 = Convert.ToByte( Console.ReadLine() );
    Console.WriteLine( "Int: " );
    int intVar2 = Convert.ToInt32( Console.ReadLine() );
    Console.WriteLine( "Float: " );
    float floatVar2 = float.Parse( Console.ReadLine() );
    Console.WriteLine( "Double: " );
    double doubleVar2 = Convert.ToDouble( Console.ReadLine() );
    Console.WriteLine( "Char: " );
    char charVar2 = Convert.ToChar( Console.ReadLine() );
    Console.WriteLine( "Boolean: " );
    bool boolVar2 = Convert.ToBoolean( Console.ReadLine() );
    Console.WriteLine( "Byte: " + byteVar2 +"\nInt: " + intVar2 +"\nFloat: " + floatVar2 +"\nDouble: " + doubleVar2 + "\nChar: " + charVar2 +"\nBoolean: " + boolVar2 +"\n\n");


    //Program 6: Difference Between Prefix/Postfix Increments
    Console.WriteLine("Program 6");
    int a = 10;
    int b = ++a;
    Console.WriteLine("Int a is initialized at 10.");
    Console.WriteLine("Int b uses a prefix increment, ++a, which means int a is increased first. Therefore, when using the declaration int b = ++a, int a is increased to " + a + ", then b is set to a, making b = " + b + ".");
    int c = a++;
    Console.WriteLine("Int c uses a postfix increment, a++, meaning that when it's set to a, a is incremented after the assignment. Therefore, when using the declaration int c = a++, int c = " + c + ", the previous value of a, and int a = " + a + ".");
  }
}