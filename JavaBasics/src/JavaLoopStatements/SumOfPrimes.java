package JavaLoopStatements;

import java.util.Scanner;

public class SumOfPrimes {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for (int i = 2; i <= 20; i++) {

			boolean prime = true;

			for (int j = 2; j < i; j++) {
				if (i % j == 0)
					{
					prime = false;

				}

			}

			if (prime) {
				System.out.println("prime number : " + i);
				sum = sum + i;

			}
		}
		System.out.println("Sum of primes are:" + sum);
	}
}
