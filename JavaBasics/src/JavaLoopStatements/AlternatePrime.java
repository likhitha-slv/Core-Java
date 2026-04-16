package JavaLoopStatements;

import java.util.Scanner;

public class AlternatePrime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int n = sc.nextInt();
		boolean tcs = true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i == 0)
			{
			tcs=false;
			break;
			}
		}
		if(tcs == true)
		{
			System.out.println("Prime");
		}
		else
		{
			System.out.println("Not a prime");
		}
  /* 	   // fibonacci using while loop 
   * int n1 = 0, n2 = 1;
		int n3 = 0;
		while (n < 10) {
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
			n++;
		}
         */
	}

}
