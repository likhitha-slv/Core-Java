package JavaArrays;

import java.util.Scanner;

public class LongestString {

	public static void main(String[] args) {
    System.out.println("Main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size = sc.nextInt();
    System.out.println("Enter the values");
    String[] arr = new String[size];
    //arr[] = Integer.toString(size);
  
    for(int i=0;i<arr.length;i++)
    {
    	arr[i] = sc.next();
    }
    String large = arr[0];
    for(int i=0;i< arr.length;i++)
    {
    	if(arr[i].length() > large.length())
    	{
    		large = arr[i];
    	}
    }
    System.out.println("Largest String is:" +large);
	}

}
