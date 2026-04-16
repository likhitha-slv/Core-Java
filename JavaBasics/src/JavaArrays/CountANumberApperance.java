package JavaArrays;

public class CountANumberApperance {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 2, 5 };
		boolean rep[] = new boolean[arr.length];

		for (int i = 0; i < arr.length; i++) {

			if (rep[i])
				continue;

			int count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					rep[j] = true;
					count++;
				}
			}

			System.out.println("The number appears:" + arr[i] + " in " + count + " times");

		}

	}
}
