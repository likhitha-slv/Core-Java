package JavaLoopStatements;

import java.util.Scanner;

public class SumUsingFor {

	public static void main(String[] args) {
      System.out.println("Main method");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = sc.nextInt();
      int sum= 0;
      for(int i = 1;i<n;i++)
      {
    	  if(n%i==0)
    	  {
    		  sum = sum + i;
    		  System.out.println(i);
    	  }
   
      }
      if(sum == n)
	  {
		  System.out.println("It is perferct number");
	  }
	}

}
