package CaseStudies;

import java.util.Scanner;

public class ArmLabTask {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int original = n;
		int temp = n;
		int count = 0;
		int sum = 0;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		temp = n;
		while (temp != 0) {
			int digit = temp % 10;
			int mul = 1;
			for (int i = 1; i <= count; i++) {
				mul = mul * digit;
			}
			sum = sum + mul;
			temp = temp / 10;
		}
		if (sum == original) {
			System.out.println("Armstrong");
		} else {
			System.out.println("Not an armstrong number ");
		}
	}

}
