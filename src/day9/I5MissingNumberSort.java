package day9;

import java.util.Arrays;

public class I5MissingNumberSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3,1 };
		System.out.println(Arrays.toString(sortArray(arr)));
		sortArray(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println("No element missing in array");
	}

	public static int[] sortArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
