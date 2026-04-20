package JavaLoopStatements;

import java.util.Scanner;

public class PracticePrime {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    boolean status = true;
    for(int i = 2; i<n;i++)
    {
    	if(n%i == 0)
    	{
    		status = false;
    		break;
    	}
    }
    if(status == true)
    {
    	System.out.println("Prime number");
    }
    else
    {
    	System.out.println("Not a prime number");
    }
    
    System.out.println("**********************");
    int temp=2;
    if(n < 2)
    {
    	status = false;
    }
    else
    {
    while(temp <= n)
    {
    	if(n % temp == 0)
    	{
    		status = false;
    		break;
    	}
    	temp++;
    }
    if(n == temp)
    {
    	System.out.println("Prime");
    }
    else
    {
    	System.out.println("Not prime");
    }
	}
	}
}
