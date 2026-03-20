package JavaLogicalStatements;
import java.util.*;
public class Practice3 
{

	public static void main(String[] args)
	{
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int a=40;
		int b=30;
		if(a > b)
		{
			System.out.println("Maximum");
		}
		else
		{
			System.out.println("Not maximum");
		}
		System.out.println("***********");
		
		int temp=30;
		if(temp < 25)
		{
			System.out.println("Hot");
		}
		else
		{
			System.out.println("Cold");
		}
		
		System.out.println("***************");
		
		int num=8;
		if(num > 0 && num % 2 == 0)
		{
			System.out.println("Positive and even");
		}
		else
		{
			System.out.println("odd");
		}
		System.out.println("*************************");
		double sal = 50000;
	    float bonus;
	    if(sal > 15000)
	    {
	    	System.out.println("Get bonus");
	    }
	    else
	    {
	    	System.out.println("No bonus");
	    }
	    System.out.println("****************");
	    System.err.println("Enter the sspecial character");
	    char ch = sc.next().charAt(0);
	    if(!(ch >= 'A' && ch <= 'Z') &&
	    		!(ch >='a' && ch <= 'z') &&
	    		!(ch >=0 && ch<= 9))
	    {
	    	System.out.println("It is a Special");
	    }
	    else
	    {
	    	System.out.println("Not a Special");
	    }
	   	System.out.println("*********************");
	   	
	   	int sp =20;
	   	int cp = 50;
	   	if(sp > cp)
	   	{
	   		System.out.println("Profit");
	   	}
	   	else if( sp < cp)
	   	{
	   		System.out.println("Loss");
	   	}
	   	else
	   	{
	   		System.out.println("no profit no loss");
	   	}
	   	System.out.println("*********************");
	   	
	   	int a1 = 14;
	   	if(a1 % 7 == 0)
	   	{
	   		System.out.println("Divisible by 7");
	   	}
	   	else
	   	{
	   		System.out.println("Not divisible by 7");
	   	}
	   	System.out.println("**************************");
	   	System.out.println("enter the age");
	   	int age = sc.nextInt();
	   	if(age > 18)
	   	{
	   		System.out.println("Major");
	   	}
	   	else
	   	{
	   		System.out.println("Minor");
	   	}
	   	System.out.println("*******************");
	   	System.out.println("enter the marks");
	   	int marks = sc.nextInt();
	   	if(marks > 35)
	   	{
	   		System.out.println("pass");
	   	}
	   	else if(marks == 35)
	   	{
	   		System.out.println("Distinction");
	   	}
	   	else
	   	{
	   		System.out.println("Fail");
	   	}
	   	System.out.println("**************************");
	   	System.out.println("enter the value");
	   	int a11 = sc.nextInt();
	   	if(a11 >= 100 && a11 <= 999)
	   	{
	   		System.out.println("It is a three digit number");
	   	}
	   	else
	   	{
	   		System.out.println("Not a 3 digit number");
	   	}
		}
	}
		

