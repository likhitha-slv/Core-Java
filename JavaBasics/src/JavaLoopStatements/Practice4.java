package JavaLoopStatements;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
    System.out.println("main method started:");
    Scanner sc = new Scanner(System.in);
    System.out.println("enter a number");
    int n = sc.nextInt();
    for(int i = 1; i<=10; i++)
    {
    	System.out.println("Multiplication:" +n+ " " +"X"+" " +i+ "="+(n*i));
    }
	}

}
