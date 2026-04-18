package day12;

import java.util.Arrays;

public class I2SortBinaryArray {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 0, 1, 0, 1 };
		sortArray(arr);
	}

	public static void sortArray(int[] arr) {
		int countZero = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				countZero++;
			}
		}
		for (int i = 0; i < countZero; i++) {
			arr[i] = 0;
		}
		for (int i = countZero; i < arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
