package day2;

import java.util.Arrays;

public class I2BubbleSort {

	public static void main(String[] args) {
		int[] arr = { 5, 3, 4, 2 };
		System.out.print(sortArray(arr));
	}
		public static String sortArray(int[] arr) {
			 int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return Arrays.toString(arr);
		}
	}

