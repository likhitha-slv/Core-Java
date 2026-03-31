package JavaConstructor;

import java.util.Scanner;

public class MinMaxDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int n = sc.nextInt();
		int min = 9;
		int max = 0;
		while (n > 0) {
			int digit = n % 10;
			if (digit < min) {
				min = digit;
			}
			if (digit > max) {
				max = digit;
			}
			n = n / 10;
		}

		System.out.println(min + " " + max);
	}

}
