package JavaArrays;

import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
    System.out.println("main method started");
    int [][] arr = new int[3][3];
    System.out.println(arr.length);//3
    System.out.println(arr[0].length);//3
    System.out.println(arr);//[[I@2b2fa4f7
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[i].length;j++)
    	{
    		System.out.print(arr[i][j] + " ");
    	}
    }
    
		System.out.println();
	}

}
