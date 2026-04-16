package JavaArrays;

import java.util.Scanner;

public class SecondLargestNum {

	public static void main(String[] args) {
    System.out.println("main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the size");
    int size = sc.nextInt();
    int[] arr = new int[size];
    int max=0;
    int temp = 0;
    System.out.println("enter the array values");
    for(int i=0;i<arr.length;i++)
    {
    	arr[i] = sc.nextInt();
    }
    for(int n:arr)
    {
    	
    	if(n > max)
    	{
    		max = n;
    	}
    	else if (max > n)
    	{
    		max= n;
    	}
    	}
    
    System.out.println("Second largest value" + max);
	
	}
}
