package JavaPatterns;

public class DiagonalDhoni {

	public static void main(String[] args) {
		int n = 7;
		char[] arr = { 'S', 'H', 'A', 'K', 'E', 'E', 'R' };
		char a = 'a';
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i == j || i + j == n - 1) {
					System.err.print(arr[i] + " ");
				} else {
					System.out.print(a + " ");

				}
			}
			System.out.println();
			a++;
		}
	}
}
