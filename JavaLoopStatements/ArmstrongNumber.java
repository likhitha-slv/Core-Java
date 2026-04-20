package JavaLoopStatements;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    int r=0;
    int mul=0;
    int temp = n ;
    while(n!=0)
    {
    	r = n%10;
    	n=n/10;
    	mul =mul+( r*r*r);
    }
    if(mul == temp)
    {
    	System.out.println("It is an armstrong number");
    }
    else
    {
    	System.out.println("Not an armstrong number ");
    }
	}

}
