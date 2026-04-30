package JavaArrays;

public class ReverseRowDiagnalSquare {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			
			if (i % 2 == 0) {

				for (int j = 0; j < arr.length; j++) {
					
					if(j<arr.length/2) {
						int temp = arr[i][(arr.length - 1) - j];
						arr[i][(arr.length - 1) - j] = arr[i][j];
						arr[i][j] = temp;
					}

					if (i == j) {
						arr[i][j] = arr[i][j] * arr[i][j];
					}

				}

			} else {
				for (int j = 0; j < arr.length; j++) {

					if (i != j) {
						arr[i][j] = arr[i][j] * 2;
					}else {
						arr[i][j] = arr[i][j] * arr[i][j];
					}

				}

			}
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}