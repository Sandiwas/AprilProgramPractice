package day2;

import java.util.Arrays;

public class I3BubbleSort {
	public static void main(String[] args) {
		int[] arr = { 0, 0, 0, 1, 0, 1, 0, 1 };
		int zeroCount = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				zeroCount++;
			}
		}
		for (int i = 0; i < zeroCount; i++) {
			arr[i] = 0;
		}
		for (int i = zeroCount; i < arr.length; i++) {
			arr[i] = 1;
		}
		System.out.println(Arrays.toString(arr));
	}
}
