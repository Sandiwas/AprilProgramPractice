package day3;

import java.util.Arrays;

public class S_7_EvenAndNumberInArray {
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

		int e = 0;
		int o = 0;

		// Step 2: Create arrays of exact size
		int[] even = new int[evenCount];
		int[] odd = new int[oddCount];

		// Step 3: Store values
		for (int num : arr) {
			if (num % 2 == 0) {
				even[e++] = num;
			} else {
				odd[o++] = num;
			}
		}
		// Step 4: Print result
		System.out.println("Even numbers: " + Arrays.toString(even));
		System.out.println("Odd numbers: " + Arrays.toString(odd));
	}
}


//Even numbers: [6, 4, 2]
//Odd numbers: [5, 3, 7, 1]