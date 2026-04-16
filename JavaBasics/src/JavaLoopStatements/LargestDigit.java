package JavaLoopStatements;

import java.util.Scanner;

public class LargestDigit {

	public static void main(String[] args) {
      System.out.println("Main method started");
      Scanner sc = new Scanner(System.in);
      System.out.println("enter a number");
      int n = sc.nextInt();
      int max=0;
      for(int i =0;i<=n;i++)
      {
    	  int digit = n%10;
    	  n=n/10;
    	  if(digit > max)
    	  {
    		  max=digit;
    	  }
      }
      System.out.println("The largest digit is:" +max);
	}

}
