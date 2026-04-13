package day8;

import java.util.Arrays;

public class SS_8_EvenAndNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };

		int evenCount = 0;
		int oddCount = 0;
		// Step 1: Count even and odd
		for (int num : arr) {
			if (num % 2 == 0) {
				evenCount++;
			} else {
				oddCount++;
			}
		}
		// Step 2: Create arrays of exact size
		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];
		int e = 0;
		int o = 0;
		// Step 3: Store values
		for (int num : arr) {
			if (num % 2 == 0) {
				even[e++] = num;
			} else {
				odd[o++] = num;
			}
		}

		System.out.println(Arrays.toString(even));
		System.out.println(Arrays.toString(odd));
	}
}
