package JavaLoopStatements;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    
    int sum=0;
    int temp=n;
   
    
    while(n!=0)
    {
    	int fact = 1;
    	int digit = n%10;
  
    for(int i=1;i<=digit;i++)//5
    {
    	fact = fact * i;
    	
    }
    sum = sum + fact;
	n=n/10;
    }
    if(temp ==  sum)
    {
    	System.out.println("Strong Number");
    }
    else
    {
    	System.out.println("Not a strong number");
    }
	}

}
