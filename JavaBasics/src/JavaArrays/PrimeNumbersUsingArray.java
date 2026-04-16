package JavaArrays;

import java.util.Scanner;

public class PrimeNumbersUsingArray {
	
	static boolean isPrime(int a)
	{
		boolean status = true;
		if(a == 0 || a == 1)
		{
			status = false;
		}
		for(int i=2;i<a;i++)
		{
			if(a % i == 0)
			{
				status = false;
				break;
			}
		}
		return status;
	}
	

	public static void main(String[] args) {
     System.out.println("main method started");
     System.out.println("Enter the size");
     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     System.out.println("enter the array elements");
     int[] arr = new int[size];
     
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i] = sc.nextInt();
     }
     System.out.println("prime numbers are:  ");
     for(int b : arr)
     {
    	boolean status = isPrime(b);
        if(status)
    		System.out.println(b); 
     }
	}

}
