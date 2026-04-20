package JavaLoopStatements;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int rev = 0;
    for(int i=1;n > 0;i++)
    {
    	int r= n%10;
    	n = n/10;
    	rev = rev * 10 + r;
    }
    System.out.println("Reverse of a number is: " +rev);
    
    
    System.out.println("****************************");
    int n1 = 1234;
   
    int r1;
    int rev1=0;
    while(n1>0)
    {
    	r1 = n1%10;
    	n1 = n1 / 10;
    	rev1 = rev1 * 10 + r1;
    }
    System.out.println("Reverse a number is:" + rev1);
	}

}
