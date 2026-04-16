package JavaLoopStatements;

import java.util.Scanner;

public class McqPractice {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	for(int i =1; i<=10;i++)
    {
    	System.out.println(i);
    }
    System.out.println("------------------");
    for(float i =10;i>=1;i--)
    {
    	System.out.println(i);
    }
    System.out.println("----------------------");
    for(int i = 10;i<=1;i++)
    {
    	System.out.println(i);//no output because condition is not satisfied
    }
    System.out.println("--------------------");
    for(int i = 10;i>=1;i++)
    {
    	//System.out.println(i);//it gives unlimited output
    }
    System.out.println("-----------------------");
    for(double i = 1; i<=50;i++)
    {
    	if(i % 2 ==0)
    	{
    		System.out.print(i+ " ");
    	}
    }
    System.out.println("************");
    for(byte i =1;i<=50;i++)
    {
    	if(i %2 != 0)
    	{
    		System.out.print(i + " ");
    	}
    }
    System.out.println("------------------");
	System.out.println("Enter a number");

	int n= sc.nextInt();
    for(short i = 1;i<=10;i++)
    {	
    	System.out.println(n+ "x" + i+ "=" +(n*i));
    }
    System.out.println("-----------------------");
    System.out.println("Enter a number");
    int n1= sc.nextInt();
    for(int i =10;i>=1; i--)
    {
    	System.out.println(n1+ "x" +i+ "=" +(n1*i));
    }
    System.out.println("*******************");
   //Sum of number upto n
	System.out.println("Enter a number");
	int n2= sc.nextInt();
	long sum=0;
    for(long i =1;i<=n2;i++)
    {
   	sum = sum + i;
   	System.out.println(sum);
    }
    System.out.println("***************");
    // Sum of all even numbers
   	System.out.println("Enter a number");
   	int n3 = sc.nextInt();
   	int sum1=0;
	for(int i=2;i<=n3;i++)
	{
		if(i%2 == 0)
		{
			sum1 = sum1 +i;
		}
	}
	System.out.println(sum1);
	
	System.out.println("************************");
	// Divisible by 3
	System.out.println("Enter a number");
	int n4 = sc.nextInt();
	int count = 0;

	for(int i =3; i<=n4;i++)
	{

		if(i%3 == 0)
		{
			count++;
		}
	}
	
	System.out.println(count +" ");
	}
	
}
