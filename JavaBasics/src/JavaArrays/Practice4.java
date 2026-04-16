package JavaArrays;

public class Practice4 {

	public static void main(String[] args) {
      int[] a = new int[5];
      a[0]=123;
      a[1]=567;
      for(int i=0;i< a.length;i++)
      {
    	  a[2]= a[0]+ a[1];
    	  //System.out.println(a[i]);//123 567 690 0 0 
    	  System.out.println(a[2]);//690 --> 5 times
      }
	}

}
