package day10;

import java.util.Arrays;

public class A2BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2, 1 };
		int[] sortArray = sortArray(arr);
		System.out.println(Arrays.toString(sortArray));
	}
	
	public static int[] sortArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped) {
				break;
			}
		}
		return arr;
	}
}
