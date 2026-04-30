package CaseStudies;

import java.util.Random;
import java.util.Scanner;

public class GuessRandomNumber {

	public static void main(String[] args) {
		System.out.println("***************Welcome to the Number Guessing Game***********");
		Scanner sc = new Scanner(System.in);

		Random rd = new Random();
		int guess = rd.nextInt(10);
		int attempt=0;
		
		//System.out.println(guess);
		System.out.println("You have 3 chances to win ....🤗");
		for (int i = 1; i <= 3; i++) {
			System.out.println("Enter a number");
			int n = sc.nextInt();
			if (n == guess) {
				System.out.println("Successfully win the game.....👏");
				break;
			} else if (n < guess) {
				System.out.println("Entered number is below");
			} else if (n > guess) {
				System.out.println("Entered number is above");
			} 
			attempt++;
			if(attempt==3) {
				System.out.println("You Fail The Game...😞");
				break;
			}
		}
	}
}
