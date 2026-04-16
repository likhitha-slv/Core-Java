package JavaArrays;

import java.util.Scanner;

public class SearchAnElmtArray {

	public static void main(String[] args) {
     System.out.println("Main method started");
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the size of an array");
     int size = sc.nextInt();
     System.out.println("Enter the values");
     String[] arr = new String[size];
     for(int i=0;i<arr.length;i++)
     {
    	 arr[i] = sc.next();
     }
     System.out.println("Search The elements in the array");
     String search = sc.next();
     boolean found = false;
     for(String s : arr)
     {
    	 if(s.equalsIgnoreCase(search))
    	 {
    		 found = true;
    	 }
     }
     if(found)
     {
    	 System.out.println("Elements Found");
     }
     else
     {
    	 System.out.println("Elements not found");
     }
	}

}
