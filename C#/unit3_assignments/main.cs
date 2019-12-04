using System;
using System.Collections.Generic;

class MainClass {

    public static int[] resetArr()
    {
      int[] arrHolder = { 250,19,17,15,13,11,10,9,6,3,2,1,-455 };
      return arrHolder;
    }

  public static void Main (string[] args) {
      
      Console.WriteLine("Sam Prestrelski - Unit 3 Assignments\n\n"); 
      int[] values = { 250,19,17,15,13,11,10,9,6,3,2,1,-455 };
      ArrayMethods x = new ArrayMethods( values );
      Console.WriteLine( "original array:\n" + x.returnArrString() );

      //Ex. A
      ArrayMethods swap = new ArrayMethods(values);
      swap.swapFirstAndLast();
      Console.WriteLine( "\nex. a:\n" + swap.returnArrString() );
      values = resetArr();

      //Ex. B
      ArrayMethods shiftR = new ArrayMethods( values );
      shiftR.shiftRight();
      Console.WriteLine( "\nex. b:\n" + shiftR.returnArrString() );
      values = resetArr();

      //Ex. C
      ArrayMethods replaceE = new ArrayMethods( values );
      replaceE.replaceEven();
      Console.WriteLine( "\nex. c:\n" + replaceE.returnArrString() );
      values = resetArr();
      
      //Ex. D
      ArrayMethods replaceL = new ArrayMethods( values );
      replaceL.replaceLarger();
      Console.WriteLine( "\nex. d:\n" + replaceL.returnArrString() );
      values = resetArr();
      
      //Ex. E
      ArrayMethods removeM = new ArrayMethods( values );
      removeM.removeMiddle();
      Console.WriteLine( "\nex e:\n" + removeM.returnArrString() );
      values = resetArr();
    
      //Ex. F
      ArrayMethods moveEven = new ArrayMethods( values );
      moveEven.moveEvenFront();
      Console.WriteLine( "\nex f:\n" + moveEven.returnArrString() );
      values = resetArr();

      //Ex. G
      ArrayMethods secondLar = new ArrayMethods( values );
      secondLar.removeSecondMax();
      Console.WriteLine( "\nex g:\n" + secondLar.returnArrString() );
      values = resetArr();

      //Bools: Ex. H-J
      bool isInc = x.isIncreasing();
      bool hasAdjDup = x.hasAdjDuplicate();
      bool hasDups = x.hasDuplicate();
      Console.WriteLine( "\noriginal array\nin increasing order: " + isInc + "\nhas adjacent duplicates: " + hasAdjDup +"\nhas any duplicates: " + hasDups );
  }
}
