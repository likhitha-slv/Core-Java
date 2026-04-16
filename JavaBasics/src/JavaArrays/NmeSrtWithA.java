package JavaArrays;

import java.util.Scanner;

public class NmeSrtWithA {

	public static void main(String[] args) {
     System.out.println("Main method started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size");
     int size = sc.nextInt();
     System.out.println("Enter the String");
     String arr[] = new String[size];
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i] = sc.next();
     }
     for(int i=0;i<size;i++)
     {
//    	if(arr[i].toLowerCase().startsWith("l") && arr[i].toLowerCase().endsWith("a"))
//    	{
//    		System.out.println(arr[i]);
//    	}
     if(arr[i].toLowerCase().startsWith("l") || arr[i].toUpperCase().endsWith("a"))
    	{
    		System.out.println(arr[i]);
    	}
    	else
    	{
    		System.out.println("Invalid output");
    	}
	}
	}

}
