public class ArrayDemo{
//0a. Make a function to print a 1D array of ints.
//1 dimensional array of integers
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

public static int[][] int1array2d(int n, int m){
  int[][] ary=new int[n][m];
  for (int i=0;i<ary.length;i++)
  {
    for (int j=0;j<ary[i].length;j++)
    {
      ary[i][j]=1;
    }
  }
  return ary;
}
//code for 2d array of all 1s

public static String fill2D(int n, int m){
  int[][] ary=new int[n][m];
  String stringarray="{\n}";
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
  //made array
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


  public static void main(String[] args){
    System.out.println(stringintarray1d(0)) ;
    System.out.println(stringintarray1d(1)) ;
    System.out.println(stringintarray1d(2)) ;
    System.out.println(stringintarray1d(3)) ;
    System.out.println(stringintarray1d(4)) ;
    //System.out.println(stringintarray1d(100)) ;
    //tests for 1 dimensional array

    System.out.println("\n");
    System.out.println(stringintarray2d(0,0)+"\n") ;
    System.out.println(stringintarray2d(1,1)+"\n") ;
    System.out.println(stringintarray2d(2,2)+"\n") ;
    System.out.println(stringintarray2d(3,3)+"\n") ;
    System.out.println(stringintarray2d(4,5)+"\n") ;
    System.out.println(stringintarray2d(4,6)+"\n") ;
    System.out.println(stringintarray2d(7,3)+"\n") ;
    System.out.println(stringintarray2d(8,2)+"\n") ;
    //System.out.println(stringintarray2d(100,100)) ;
    //tests for 2 dimensional arrays

    System.out.println(countZeros2D(4,5)) ; //20
    System.out.println(countZeros2D(5,5)) ; //25
    System.out.println(countZeros2D(6,7)) ; //42
    System.out.println(countZeros2D(2,9)) ; //18
    System.out.println(countZeros2D(8,7)) ; //56
    //tests to count 0s for 2 dimensional arrays of 0s

    System.out.println(fill2D(4,5)) ;
    System.out.println(fill2D(5,6)) ;
    System.out.println(fill2D(8,6)) ;
    System.out.println(fill2D(9,9)) ;
    System.out.println(fill2D(3,2)) ;
    //2 dimensional array of 1s, but if row#=column#, return 3
  }

}
