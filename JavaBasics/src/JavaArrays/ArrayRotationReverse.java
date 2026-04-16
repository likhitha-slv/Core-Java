package JavaArrays;

import java.util.Scanner;

public class ArrayRotationReverse {

	public static void arrayReverse(int[] arr, int start, int end) {
		int temp = 0;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}

	public static void arrayRotate(int[] arr, int r) {
		int start = 0;
		int end = arr.length - 1;
//		arrayReverse(arr, start, end);
//		arrayReverse(arr, start, r - 1);
//		arrayReverse(arr, r, end);
		arrayReverse(arr, 0, arr.length - 1);
	}

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);
		
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Before rotation:");
		for(int a: arr)
		{
			System.out.print(a + " ");
		}
        System.out.println();
//		System.out.println("enter the no.of rotations you want");
//		int r = sc.nextInt();
		arrayRotate(arr, 0);
		System.out.println("After rotation");
		for (int a : arr) {
			System.out.print(a + " ");
		}
	}

}
