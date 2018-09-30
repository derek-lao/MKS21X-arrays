public class ArrayDemo{
//0a. Make a function to print a 1D array of ints.
//1 dimensional array of integers
  public static void printarray(int[] ary1d){
    System.out.print("{");
    for (int i=0;i<ary1d.length;i++)
    {
      if (i<ary1d.length-1)
      {
        System.out.print(ary1d[i]+", ");
      }
      else
      {
        System.out.print(ary1d[i]);
      }
    }
    System.out.println("}");
  }

//0b. Make a function to print a 2d array of ints.
  public static void printarray(int[][] ary2d){
    System.out.println("{");
    for (int i=0;i<ary2d.length;i++)
    {
      System.out.print("{");
      //for every array in ary2d, print open curly brace
      for (int j=0;j<ary2d[i].length;j++)
      {
        if (j<(ary2d[i].length-1))
        {
          System.out.print(ary2d[i][j]+", ");
        }
        else
        {
          System.out.print(ary2d[i][j]);
        }
      }
      System.out.println("}");
    }
    System.out.println("}");
  }

   public static String make2dstring(int n, int m){
      int[][] ary=new int[n][m];
      String stringarray="{";
      for (int p=0;p<ary.length;p++)
      {
        stringarray+= "\n{";
        for (int q=0;q<ary[p].length;q++)
        {
          stringarray+= (ary[p][q]+"");
          if(q<ary[p].length-1)
          {
            stringarray+= ", ";
          }
        }
        stringarray+= "}";
      }
      stringarray+= "\n}";
      if (ary.length==0)
      {
        return "{}";
      } //if array has length 0
      return stringarray;
    }
    //code to turn 2d rectangular array into string
    public static String stringintarray1d(int n){
      String stringarray="{";
      int[] ary=new int[n];
      for (int i=0;i<ary.length;i++)
      {
        ary[i]=i+1;
      }
      //made the integer array
      for (int i=0;i<ary.length;i++)
      {
        stringarray=stringarray+(ary[i]+"");
        if (i<ary.length-1)
        {
          stringarray=stringarray+", ";
        }
        else
        {
          stringarray=stringarray+"}";
        }
      }
      if (ary.length==0)
      {
        return "{}";
      } //for exception of array having 0 length
      return stringarray;
    }
//finish 1 dimensional array

//0b. Make a function to print a 2d array of ints.
//2 dimensional array of integers
    public static String stringintarray2d(int n, int m){
      int[][] ary=new int[n][m];
      for (int i=0;i<ary.length;i++)
      {
        for (int j=0;j<ary[i].length;j++)
        {
          ary[i][j]=j+1;
        }
      }
  //made the array of integers
      String stringarray="{";
      for (int p=0;p<ary.length;p++)
      {
        stringarray+= "\n{";
        for (int q=0;q<ary[p].length;q++)
        {
          stringarray+= (ary[p][q]+"");
          if(q<ary[p].length-1)
          {
            stringarray+= ", ";
          }
        }
        stringarray+= "}";
      }
      stringarray+= "\n}";
      if (ary.length==0)
      {
        return "{}";
      } //if array has length 0
      return stringarray;
    }
//finish 2 dimensional array

//1. Calculate and return how many zeros are in the parameter
//(a rectangular 2D array of integers)
    public static int[][] int0array2d(int n, int m){
      int[][] ary=new int[n][m];
      for (int i=0;i<ary.length;i++)
      {
        for (int j=0;j<ary[i].length;j++)
        {
          ary[i][j]=0;
        }
      }
      return ary;
    }
//code for 2 dimensional array of numbers with many 0s
    public static int countZeros2D(int n, int m){
      int count=0;
      int[][] nums=(int0array2d(n,m));
      for (int i=0;i<nums.length;i++)
      {
        for (int j=0;j<nums[i].length;j++)
        {
          if (nums[i][j]==0)
          {
            count++;
          }
        }
      }
      return count;
    }
//code to count the 0s

/* 2a. Modify a given 2D array of integer as follows:
Replace all the of values with 1's
EXCEPT when the row number is the same as the column number:
you must fill those with 3's instead. */
public static int[][] arrayofzeroes(int n, int m){
  int[][] zeroarray= new int[n][m];
  for (int i=0;i<zeroarray.length;i++)
  {
    for (int j=0;j<zeroarray[i].length;j++)
    {
      zeroarray[i][j]=0;
    }
  }
  return zeroarray;
}

public static int[][] fill2D(int[][] ary){
  for (int i=0;i<ary.length;i++)
  {
    for (int j=0;j<ary[i].length;j++)
    {
      if (i==j)
      {
        ary[i][j]=3;
      }
      else
      {
        ary[i][j]=1;
      }
    }
  }
  return ary;
}

  /* made array of all 1s, unless column number is equal to row number, then
  that is equal to 3 */



  public static void main(String[] args){
    int[] ary1d={1,2,3};
    printarray(ary1d);

    int[][] ary2d=
    {
      {1,2,3,4,5,6},
      {1,2,3,4},
      {2,24,25,26},
      {2,4,6,8}
    };
    printarray(ary2d);

    System.out.println(countZeros2D(4,5)) ; //20
    System.out.println(countZeros2D(5,5)) ; //25
    System.out.println(countZeros2D(6,7)) ; //42
    System.out.println(countZeros2D(2,9)) ; //18
    System.out.println(countZeros2D(8,7)) ; //56
    //tests to count 0s for 2 dimensional arrays of 0s

    int[][] samplearrayofanything={
      {123},
      {12344,54},
      {1234,73645,325432},
      {23123444,46745,123431,5678},
    };
    printarray(fill2D(samplearrayofanything));
    //expect every number per array to be 1, but every last number to be a 3
    printarray(fill2D(arrayofzeroes(5,5))) ;
    printarray(fill2D(arrayofzeroes(6,8))) ;
    printarray(fill2D(arrayofzeroes(7,5))) ;
    printarray(fill2D(arrayofzeroes(10,10))) ;
    //2 dimensional array of 1s, but if row#=column#, return 3

  }

}
