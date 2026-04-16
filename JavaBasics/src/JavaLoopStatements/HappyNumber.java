package JavaLoopStatements;

import java.util.Scanner;

public class HappyNumber {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
    int r=0; 
    int temp=n;
    while(temp!=1)
    {
    	int sum=0;
    while(temp!=0)
    {
    	r=temp%10;
    	temp=temp/10;
    	//sum = sum+r;
    	sum = r * r + sum;
    	
    }
    temp=sum;
    System.out.println(sum);
    
	}
   
    if(temp == 1)
    {
    	System.out.println("Happy number");
    }
    else
    {
    	System.out.println("Not Happy number");
    }

}
}
