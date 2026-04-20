package JavaLoopStatements;

import java.util.Scanner;

public class Prime100 {

	public static void main(String[] args) {
    System.out.println("Min method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n= sc.nextInt();
    int count=0;
   
    for(int i = 2; i<=n; i++)
    {
      boolean status = true;
   
    	for(int j = 2; j<i;j++)
    	{
    	if(i % j == 0)
    	{
    		status = false;
    		break;
    	}
    	}

    if(status)
    {
    	System.out.println(i+ " ");
    	count++;
    }
    }
    System.out.println("Count is " +count);
	}

}
