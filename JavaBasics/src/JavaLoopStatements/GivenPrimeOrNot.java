package JavaLoopStatements;

import java.util.Scanner;

public class GivenPrimeOrNot {

	static boolean isGivenNumberPrime(int num) {
		boolean isPrime = true;

		if (num <= 1) {
			return false;
		}

		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				isPrime = false;
			}
		}

		return isPrime;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//				

		System.out.println("Enter a number    :");
		int a = sc.nextInt();

		boolean notprimeNum = true;

		while (notprimeNum == true) {

			notprimeNum = false;

			if (isGivenNumberPrime(a) == false) {
				notprimeNum = true;
			}

			if (notprimeNum == true) {
				System.out.println(a + " is not prime");
				System.out.println("Enter a number again    :");
				a = sc.nextInt();
			}
		}

		System.out.println("Enter b number     :");
		int b = sc.nextInt();

		// ----------------------------------------------------

		notprimeNum = true;

		while (notprimeNum == true) {

			notprimeNum = false;

			if (isGivenNumberPrime(b) == false) {
				notprimeNum = true;
			}

			if (notprimeNum == true) {
				System.out.println(b + " is not prime");
				System.out.println("Enter b number again    :");
				b = sc.nextInt();
			}
		}

		int sum = a + b;
		boolean sumPrime = true;

		if (isGivenNumberPrime(sum) == false) {
			notprimeNum = true;
		}

		if (sumPrime == true) {
			System.out.println(sum + " : sum is prime");
		} else {
			System.out.println(sum + " : sum is notprime");
		}

	}
}
