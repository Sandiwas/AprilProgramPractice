package day12;

import java.util.Arrays;

public class I1SortBinaryArray {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 0, 1, 0, 1 };
		System.out.println(Arrays.toString(sortBinaryArray(arr)));
	}

	public static int[] sortBinaryArray(int[] arr) {

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
