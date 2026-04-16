package JavaArrays;

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {
   System.out.println("Main method started");
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter the size");
   int n = sc.nextInt();
   String[] size = new String[n];
   
   size[0] = "Likki";
   size[1] = "Lucky";
   size[2] = "Chicky";
   for(int i=0;i<size.length;i++)
   {
	  // size[i] = sc.next();
	   //System.out.println(size[i]);
   }
   for(String t:size)
   {
	   System.out.println(t);
   }
	}

}
