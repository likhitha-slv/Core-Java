package JavaLoopStatements;

import java.util.Scanner;

public class FactorialUsingRecursion {
  static int findFact(int n)
  {
	  if(n==1)
	  {
		  return 1;
	  }
	  return n * findFact(n-1);
  }

	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     int fact =1;
     int ft = findFact(n);
     System.out.println("Factorial of a number is: " +ft);
	}

}
