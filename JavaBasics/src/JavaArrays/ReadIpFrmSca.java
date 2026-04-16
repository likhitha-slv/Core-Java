package JavaArrays;

import java.util.Scanner;

public class ReadIpFrmSca {

	public static void main(String[] args) {
    System.out.println("Main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size");
    int size = sc.nextInt();
    System.out.println("Enter the values");
    String arr[] = new String[size];
    for(int i=0;i<arr.length;i++)
    {
    	arr[i] = sc.next();
    }
    for(String s : arr)
    {
    	System.out.println(s);
    }
	}

}
