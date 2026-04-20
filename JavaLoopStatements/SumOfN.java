package JavaLoopStatements;

import java.util.Scanner;

public class SumOfN {

	public static void main(String[] args) {
      System.out.println("main method started");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a number");
      int n=sc.nextInt();
      int sum=0;
      for(int i=0;i<=n;i++)
      {
    	  sum = sum + i;
      }
      System.out.println("Sum of n natural numbers are: " +sum);
	}

}
