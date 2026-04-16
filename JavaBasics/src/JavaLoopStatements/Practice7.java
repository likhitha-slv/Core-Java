package JavaLoopStatements;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n= sc.nextInt();
    int sum=0;
    for(int i = 1; n >0;i++)
    {
    	int digit = n%10;
    	n = n/10;
    	sum = sum + digit;
    }
    System.out.println("Sum of digits are:" +sum);
    
    
    System.out.println("**************************");
    
    int n1 = 1234;
    int sum1 = 0;
    while(n1>0)
    {
    	int digit1 = n1 %10;
    	n1 = n1/10;
    	sum1 = sum1 + digit1;
    }
    System.out.println("Sum of digits are:" +sum1);
	}

}
