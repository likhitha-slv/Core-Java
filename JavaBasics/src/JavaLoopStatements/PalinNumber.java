package JavaLoopStatements;

import java.util.Scanner;
// eg  is 
public class PalinNumber {

	public static void main(String[] args)
	{
		System.out.println("main method started");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");//151(yes)
        int n = sc.nextInt();
        int r=0;
        int rev =0;
        int temp =n;
        for(int i=1; n>0;i++)
        {
        	r =n%10;
        	n=n/10;
        	rev= rev*10+r;
        	
        }
        if(temp == rev)
        {
        	System.out.println("palindrome");
        }
        else
        {
        	System.out.println("Not a palindrome");
        }
	}

}
