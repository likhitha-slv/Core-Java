package JavaLoopStatements;

import java.util.Scanner;

public class MagicNumber {

	public static void main(String[] args) {
     System.out.println("main method started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number");
     int n = sc.nextInt();
     int r=0;
     int sum=n;
     int temp=0;
     while(n>9)
     {
    	temp=n;
    	sum=0;
    
     while(temp!=0)
     {
    	 r= temp%10;
    	 sum = sum + r;
    	 temp= temp/10;
    	 
     }
     n=sum;
     }
     System.out.println(sum);
     
    if(n == 1)
    {
    	System.out.println("Magic Number");
    }
    else
    {
    	System.out.println("Not a Magic number");
    }
	}

}
