package JavaLoopStatements;

import java.util.Scanner;

public class GCDOrHCF {

	public static void main(String[] args) {
    System.out.println("main method started");
    System.out.println("enter the values");
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b= sc.nextInt();
    while(b!=0)
    {
    	int temp = b;
    	b = a % b;
    	a = temp;
    }
    System.out.println("The gcd of a and b is: " +a);
	}

}
