package JavaLoopStatements;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
    System.out.println("Main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n=sc.nextInt();
    for(int i = 1;i<= n ;i++)
    {
    	if(i%2==0)
    	{
    		System.out.println("Even" +i);
    	}
    	else if(i%2 != 0)
    	{
    		System.out.println("Odd" +i);
    	}
    	else
    	{
    		System.out.println("Odd");
    	}
    }
    System.out.println("--------------------");
    
	}

}
