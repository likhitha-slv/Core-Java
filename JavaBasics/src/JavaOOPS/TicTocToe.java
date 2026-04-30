package JavaOOPS;

import java.util.Scanner;

public class TicTocToe {
	static Scanner sc = new Scanner(System.in);
	static char[][] arr = new char[3][3];

	static void resetBoard() {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = ' ';
			}
		}
	}

	static void boardPrint() {
		System.out.println("---------------");
		for (int i = 0; i < 3; i++) {
			System.out.print("| ");
			for (int j = 0; j < 3; j++) {
				System.out.print(arr[i][j] + " | ");
			}
			System.out.println();
			System.out.println("---------------");
		}
	}

	public static void main(String[] args) {
		System.out.println("=====Welcome-To--(Tic-Tac-Toe)--Game=====");
		System.out.println();
		boolean stop = false;
       while(!stop)
       {
		resetBoard();

		System.out.print("Enter the player1 name : ");
		String player1 = sc.next();
		System.out.print("Enter the player2 name : ");
		String player2 = sc.next();

		System.out.println("-------------------------------------");
		boardPrint();

		int chance = 1;

		while (chance <= 9) { // minimal fix
			int i = 1;
			while (i <= 2 && chance <= 9) {

				if (i == 1) {
					System.out.print("Enter the player1 position(1-9): ");
					int pos = sc.nextInt();

					if (pos > 9 || pos <= 0) {
						System.out.println("You entered the invalid number");
						break;
					}
						

					if (markBoard(pos, 1)) {
						boardPrint();
						System.out.println(player1 + " you win the game");
						return;
					}
					boardPrint();
					i++;
					chance++;
				}

				if (chance > 9)
					break;

				System.out.print("Enter the player2 position(1-9): ");
				int pos = sc.nextInt();

				if (pos > 9 || pos <= 0)
					continue;

				if (markBoard(pos, 2)) { // fixed player id
					boardPrint();
					System.out.println(player2 + " you win the game");
					return;
				}
				boardPrint();
				i++;
				chance++;
			}
		}

		if (chance > 9) {
			System.out.println("=------Game Draw-----=");
		}
		
		System.out.println("Do you want to play again..(yes-> y (or) No-> n)");
		char yn=sc.next().charAt(0);
		
		if(yn=='n') {
			stop=true;
		}
	}
	}
	

	static boolean markBoard(int pos, int ply) {
		int n = 1;

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {

				if (pos == n) {

					if (arr[i][j] != ' ') { // prevent overwrite
						System.out.println("Position already filled!");
						return false;
					}

					if (ply == 1) {
						arr[i][j] = 'X';
					} else {
						arr[i][j] = 'O';
					}

					return checkWin(ply);
				}
				n++; // important fix
			}
		}
		return false;
	}

	static boolean checkWin(int ply) {
		char ch = (ply == 1) ? 'X' : 'O';

		// rows
		for (int i = 0; i < 3; i++) {
			if (arr[i][0] == ch && arr[i][1] == ch && arr[i][2] == ch)
				return true;
		}

		// columns
		for (int j = 0; j < 3; j++) {
			if (arr[0][j] == ch && arr[1][j] == ch && arr[2][j] == ch)
				return true;
		}

		// diagonals
		if (arr[0][0] == ch && arr[1][1] == ch && arr[2][2] == ch)
			return true;

		if (arr[0][2] == ch && arr[1][1] == ch && arr[2][0] == ch)
			return true;

		return false;
	}
}