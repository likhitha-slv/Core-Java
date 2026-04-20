package JavaLoopStatements;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum=0;
    int temp=n;
    int mul = n*n;
    while(mul!= 0)
    {
      int r = mul%10;
      mul=mul/10;
      sum= sum+r;
      
      	
    }
    if(temp == sum)
    {
    	System.out.println("Neon");
    }
    else
    {
    	System.out.println("Not a neon");
    }
	}

}
