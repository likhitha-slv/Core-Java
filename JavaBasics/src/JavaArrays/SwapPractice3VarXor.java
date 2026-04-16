package JavaArrays;

import java.util.Scanner;

public class SwapPractice3VarXor {

	public static void main(String[] args) {
    System.out.println("Main method started");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    System.out.println("enter another number");
    int b=sc.nextInt();
    int temp;
    System.out.println("Before Swapping");
    System.out.println(a);
    System.out.println(b);
    System.out.println("----------------------");
    System.out.println("After Swapping");
    temp = a ^ b;
    a = temp ^ a;
    b = temp ^ b;
    System.out.println(a);
    System.out.println(b);
	}

}
