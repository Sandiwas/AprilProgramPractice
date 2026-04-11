package day7;

import java.util.Arrays;

public class I4SortBinaryArray {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 0, 1, 0, 1 };
		int zeroCont = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCont++;
			}
		}
		for (int i = 0; i < zeroCont; i++) {
			arr[i] = 0;
		}
		for (int i = zeroCont; i < arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
