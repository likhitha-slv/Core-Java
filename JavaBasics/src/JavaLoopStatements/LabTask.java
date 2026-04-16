package JavaLoopStatements;

import java.util.Scanner;

public class LabTask {

	public static void main(String[] args) {
		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter a number");
		int n = 50;
		int evenSum = 0;
		int oddSum = 0;
		int evenCount=0;
		int oddCount=0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				evenSum = evenSum + i;
				evenSum++;
				evenCount++;
				
			} 
			else 
			{
				oddSum = oddSum + i;
				oddSum++;
				oddCount++;
			}

		}
		System.out.println("Even : " + evenSum);
        System.out.println("Event Count: " + evenCount);
		System.out.println("Odd : " + oddSum);
		System.out.println("Odd count: " +oddCount);
	}
}
