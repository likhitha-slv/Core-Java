package JavaArrays;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {
     System.out.println("Main method started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size  numbers");
     int n=sc.nextInt();
     System.out.println("Enter the numbers of the array");
     int arr[] = new int[n];
     
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i] = sc.nextInt();
     }
     for(int i=0;i<arr.length;i++)
     {
    	 if(arr[i]%2==0)
    	 {
    		 System.out.println("Even:" +arr[i]);
    	 }
    	 else
    	 {
    		 System.out.println("Odd:" +arr[i]);
    	 }
     }
	}

}
