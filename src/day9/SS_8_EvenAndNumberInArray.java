package day9;

import java.util.Arrays;

public class SS_8_EvenAndNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		int countEven = 0;
		int countOdd = 0;

		// Step 1: Count even and odd
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}
		// Step 2: Create arrays of exact size
		int[] even = new int[countEven];
		int[] odd = new int[countOdd];

		int e = 0;
		int o = 0;
		// Step 3: Store values
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[e++] = arr[i];
			} else {
				odd[o++] = arr[i];
			}
		}
		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}
}
