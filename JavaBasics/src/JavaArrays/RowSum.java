package JavaArrays;

public class RowSum {

	public static void main(String[] args) {

		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			int sum1 = 0;
			for (int j = 0; j < arr.length; j++) {

				sum = sum + arr[i][j];
				sum1 = sum1 + arr[j][i];

			}
			System.out.println();
			System.out.print("Row sum" + sum);
			System.out.println();
			System.out.print("Column sum" + sum1);
		}

	}

}
