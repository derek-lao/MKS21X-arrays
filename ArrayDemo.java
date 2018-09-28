public class ArrayDemo{
//1 dimensional array of integers
    public static String stringintarray1d (int n){
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

//2 dimensional array of integers
  public static String stringintarray2d (int n, int m){
    String stringarray="{";
    int[][] ary=new int[n][m];
    for (int i=0;i<ary.length;i++)
    {
      for (int j=0;j<ary[i].length;j++)
      {
        ary[i][j]=j+1;
      }
    }
//made the array of integers
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
    System.out.println(stringintarray2d(4,4)+"\n") ;
    //System.out.println(stringintarray2d(100)) ;
    //tests for 2 dimensional arrays
  }

}
//0b. Make a function to print a 2d array of ints.
