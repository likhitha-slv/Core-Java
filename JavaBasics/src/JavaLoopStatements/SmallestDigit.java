package JavaLoopStatements;

import java.util.Scanner;

public class SmallestDigit {

	public static void main(String[] args) {

		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int min=9;
		for(int i=0;n>0;i++)
		{
			int digit= n%10;
			n = n/10;
			if(digit<min)
			{
				min=digit;
			}
		}
		System.out.println("The smallest digit is:" +min);
	}

}
