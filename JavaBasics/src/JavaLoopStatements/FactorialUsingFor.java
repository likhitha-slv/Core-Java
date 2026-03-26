package JavaLoopStatements;
//Factors of a number

//6 -- 1,2,3
import java.util.Scanner;

public class FactorialUsingFor {

	public static void main(String[] args) {
    System.out.println("Main method");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
	int n = sc.nextInt();
	
	for(int i = 1; i<=n; i++)
	{
		System.out.println(i);
		if(n%i==0) 
		{
			System.out.println(i);
		}
	}
	System.out.println("------------------");
	for(int i = 1; i<=n/2; i++)
	{
		System.out.println(i);
		if(n%i==0) 
		{
			System.out.println(i);
		}
	}
	}

}
