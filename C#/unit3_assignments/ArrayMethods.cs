using System.Collections.Generic;
using System.Linq;

public class ArrayMethods{
    int [] a;
    public ArrayMethods( int[] initialValues){
        a = initialValues;
    }

    public void swapFirstAndLast(){
        //Exercise A
        //swap the first and last element in the array
        int temp = 0;
        temp = a[0];
        a[0] = a[ a.Length - 1];
        a[a.Length - 1] = temp;
    }

    public void shiftRight(){
        //Exercise B
        //shift all elements by one to the right and move the last element into the first
        int temp = 0;
        temp = a[a.Length-1];
        for ( int i = a.Length - 2; i >= 0; i--){
            a[i+1] = a[i];
        }
        a[0] = temp;
    }

    public void replaceEven(){
        //Exercise C
        //replace all even elements with 0
        for (int i = 0; i < a.Length; i++){
            a[i] = ( a[i] % 2 == 0) ? 0 : a[i];
        }

    }

    public void replaceLarger(){
        //Exercise D
        //replace each element except the first and last by the larger of its two neighbors
        for ( int i = 1; i < a.Length - 1; i++){
            a[i] = ( a[i-1] > a[i+1] ) ? a[i-1] : a[i+1];
        }
    }
    public void removeMiddle(){
        //Exercise E
        //remove the middle elements if the array length is odd, or the middle two elements if the length is even
        List<int> tempList = a.ToList();
        if ( a.Length % 2 != 0)
        {
            tempList.RemoveAt( ( a.Length + 1 ) / 2 );
        }
        else
        {
            tempList.RemoveRange( a.Length/2 -1 , a.Length/2 );
        }

        a = tempList.ToArray();

    }

    public void moveEvenFront(){
        //Exercise F
        //move all even elements to the front, otherwise preserve the order of the elements
        List<int> tempList = new List<int>();
        for ( int i = 0; i < a.Length; i++)
        {
            if ( a[i] % 2 == 0 )
            {
                tempList.Add(a[i]);
            }
        }
        for ( int i = 0; i < a.Length; i++ )
        {
            if ( a[i] % 2 != 0 )
            {
                tempList.Add(a[i]);
            }
        }
        a = tempList.ToArray();

    }

    public void removeSecondMax(){
        //Exercise G
        //remove the second-largest element in the array
        int largest = a.Min();
        int second = a.Min();
        List<int> tempList = new List<int>();
        foreach ( int i in a ){
            if ( i > largest )
            {
                second = largest;
                largest = i;
            }
            else if ( i >second )
                second = i;
        }

        foreach ( int i in a ){
            if ( i != second )
            {
                tempList.Add( i );
            }
        }

        a = tempList.ToArray();

    }

    public bool isIncreasing(){
        //Exercise H
        //return true if the array is currently sorted in increasing order
        for ( int i = 0; i < a.Length - 1; i++)
        {
            if ( a[i] > a[i+1] )
                return false;
        }
        return true;
    }

    public bool hasAdjDuplicate(){
        //Exercise I
        //return true if the array contains two adjacent duplicate elements
        for ( int i = 0; i < a.Length-1; i++){
            if ( a[i] == a[i+1])
                return true;
        }
        return false;
    }

    public bool hasDuplicate(){
        //Exercise J
        //return true if the array contains duplicate elements
        for ( int i = 0; i < a.Length; i++ )
        {
            for (int j = 0; j < a.Length; j++)
            {
                if ( a[i] == a[j] && i != j)
                    return true;
            }
        }
        return false;
    }

    public string returnArrString()
    {
        return string.Join(", ", a);
    }

}