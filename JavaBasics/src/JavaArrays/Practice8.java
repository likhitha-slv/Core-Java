package JavaArrays;

import java.util.Arrays;

public class Practice8 {
	
	public static void main(String[] args) {
    int a[]= {10,15,20,25,30};
   int b[]=new int[3];
   int c[]=new int[2];
  for(int i:a) {
	  if(i%2==0) {
		  b[i]+=a[i];
	  }
	  else {
		c[i]+=i;  
	  }
   }
  System.out.println(Arrays.toString(b));
	}
	

}
