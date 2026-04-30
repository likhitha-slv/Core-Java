package JavaArrays;

import java.util.Arrays;
import java.util.Iterator;

public class MergeSort {

	static void divide(int[] arr) {
		if (arr.length <= 1)
			return;

		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];

		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		for (int j = 0; j < right.length; j++) {
			right[j] = arr[(arr.length / 2) + j];
		}

		divide(left);
		System.out.println("Left Side: " + Arrays.toString(left));
		divide(right);
		System.out.println("Right side :" + Arrays.toString(right));

		merge(left, right, arr);
	}

	static void merge(int[] l, int[] r, int[] arr) {
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < l.length && j < r.length) {
			if (l[i] < r[j]) {
				arr[k++] = l[i++];
			} else {
				arr[k++] = r[j++];
			}
		}
		while (i < l.length) {
			arr[k++] = l[i++];
		}
		while (j < r.length) {
			arr[k++] = r[j++];
		}
	}

	public static void main(String args[]) {
		System.out.println("main method started");
		int[] arr = { 4, 2, 1, 3 };
		System.out.println(Arrays.toString(arr));
		System.out.println("Before Sorting:" + Arrays.toString(arr));
		
		// -------------------------------------Another Type--------------------------------//

		int[] left = new int[arr.length / 2];
		int[] right = new int[arr.length - left.length];

		for (int i = 0; i < left.length; i++) {
			left[i] = arr[i];
		}

		for (int i = 0; i < right.length; i++) {
			right[i] = arr[(arr.length / 2) + i];
		}

		System.out.print(Arrays.toString(left) + "  | ");
		System.out.println(Arrays.toString(right));
		System.out.println();

		// -------------------------------------------------
		int[] l_left = new int[left.length / 2];
		int[] l_right = new int[left.length - l_left.length];

		for (int i = 0; i < l_left.length; i++) {
			l_left[i] = left[i];
		}

		for (int i = 0; i < l_right.length; i++) {
			l_right[i] = left[(left.length / 2) + i];
		}

		System.out.println("----------------------------");

		System.out.print(Arrays.toString(l_left) + "  ");
		System.out.print(Arrays.toString(l_right) + "    | ");

		// -----------------------------------------------------------
		int[] r_left = new int[right.length / 2];
		int[] r_right = new int[right.length - r_left.length];

		for (int i = 0; i < r_left.length; i++) {
			r_left[i] = right[i];
		}

		for (int i = 0; i < r_right.length; i++) {
			r_right[i] = right[(right.length / 2) + i];
		}

		System.out.print(Arrays.toString(r_left) + "  ");
		System.out.println(Arrays.toString(r_right));
		System.out.println();

		// ---------------------------------------------------------
		if (l_left[0] < l_right[0]) {
			left[0] = l_left[0];
			left[1] = l_right[0];
		} else {
			left[0] = l_right[0];
			left[1] = l_left[0];
		}

		System.out.println("----------------------------");
		System.out.print(Arrays.toString(left) + "     |     ");
		System.out.println(Arrays.toString(right));
		System.out.println();

		// ----------------------------------------------
		if (r_left[0] < r_right[0]) {
			right[0] = r_left[0];
			right[1] = r_right[0];
		} else {
			right[0] = r_right[0];
			right[1] = r_left[0];
		}

		System.out.println("----------------------------");
		System.out.print(Arrays.toString(left) + "     |     ");
		System.out.println(Arrays.toString(right));
		System.out.println();

		// ----------------------------------------------
		// FINAL MERGE STEP

		int i = 0, j = 0, k = 0;

		while (i < left.length && j < right.length) {
			if (left[i] < right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}

		while (i < left.length) {
			arr[k] = left[i];
			i++;
			k++;
		}

		while (j < right.length) {
			arr[k] = right[j];
			j++;
			k++;
		}

		System.out.println("----------------------------");
		System.out.println("After Sorting: " + Arrays.toString(arr));
	}

}
