package JavaLogicalStatements;

import java.util.Scanner;

public class Practice9 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	System.out.println("Enter your choice:");

		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			System.out.println("Square:");
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 3; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			break;

		case 2:
			System.out.println("Rectangle:");
			for (int i = 1; i <= 3; i++) {
				for (int j = 1; j <= 4; j++) {
					System.out.print(" 5 ");
				}
				System.out.println();
			}
			break;

		case 3:
			System.out.println("Triangle:");
			for (int i = 1; i <= 4; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print("1 ");
				}
				System.out.println();
			}
			break;

		default:
			System.out.println("Invalid choice");
		}
	}
}
