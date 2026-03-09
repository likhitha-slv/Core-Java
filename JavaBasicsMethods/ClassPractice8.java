package JavaBasicsMethods;

import java.util.Scanner;

public class ClassPractice8 {
	static String show(String name) {
		name = "ilove";
		return name + "-india";
	}

	public static void main(String[] args) {

		System.out.println("main method started");

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the string");
		String name = sc.next();

		System.out.println("the string " + name);

		// Printing returned value
		System.out.println(show(name));

		System.out.println("enter number");
		int a = sc.nextInt();

		System.out.println(method(a));
		System.out.println(method2());
	}

	static int method(int a) {
		return 'A';
	}
	static char method2()
	{
		int a = 65;
		return 65;
	}
}
