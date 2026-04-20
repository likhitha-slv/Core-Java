package JavaLoopStatements;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			sum = sum + i;

		}

		System.out.println(sum);
	}

}

class A
{
	//In this code it gives an error i.e StackOverFlowError
	//Because we created an object in a class level
	A a = new A();
	public static void main(String args[])
	{
		System.out.println("Hello");
	}
	static
	{
		System.out.println("Hai");
	}
	{
		System.out.println("How are you");
	}
}