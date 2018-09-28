  //0a. Make a function to print a 1D array of ints.
/* public static String[] oneDarray(int[] ary){
   String onedimensionalstringarray="";
  for (int i=0;i<ary.length;i++)
  {
    onedimensionalstringarray+=(ary[i]+"");
  }
  return onedimensionalstringarray;
} */
public class ArrayDemo{
/*
    public static int[] intarray(int n){
      //all integers 1 to n inclusive
      int[] ary=new int[n];
      for (int i=0;i<ary.length;i++)
      {
        ary[i]=i+1;
      }
      return ary;
    }
*/
    public static String stringintarray(int n){
      String stringarray="{";
      int[] ary=new int[n];
      for (int i=0;i<ary.length;i++)
      {
        ary[i]=i+1;
      }
      //int[] ary= (intarray(n));
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
      }
      return stringarray;
    }

  public static void main(String[] args){
    System.out.println(stringintarray(0)) ;
    System.out.println(stringintarray(1)) ;
    System.out.println(stringintarray(2)) ;
    System.out.println(stringintarray(3)) ;
    System.out.println(stringintarray(4)) ;
    //System.out.println(stringintarray(100)) ;
  }

}
//0b. Make a function to print a 2d array of ints.
