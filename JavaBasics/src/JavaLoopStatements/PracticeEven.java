package JavaLoopStatements;
//Write a program to print the even number from 0 - 100  by using for loop
import java.util.Scanner;

public class PracticeEven {

	public static void main(String[] args) {
     System.out.println("Main method started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     System.out.println("Even numbers");
     for(int i =0; i<=n;i++)  //input 2---- 2%2 == 0
     {
    	 if(i % 2 == 0)
    	 {
    		 System.out.println(i);
    	 }
     }
     System.out.println("odd numbers");
    for(int i=1; i<=n;i++)
    {
    	if(i % 2 != 0)
    	{
    		System.out.println(i);
    	}
    }
	}

}
