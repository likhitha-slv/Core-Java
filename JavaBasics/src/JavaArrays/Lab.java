package JavaArrays;

import java.util.Arrays;

public class Lab {

	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				for (int j = i; j < arr.length; j++) {

					arr[i][j] = arr[i][arr.length-1-j];
				}
			}
			for (int j = 0; j < arr.length; j++) {
				if (i == j) {
					arr[i][j] = arr[i][j] * arr[i][j];
				}
				else if (i % 2 != 0 && i != j) {
					arr[i][j] = arr[i][j] * 2;
				}
				
			}

		}
		System.out.print("arr:" + Arrays.deepToString(arr));

	}

}
