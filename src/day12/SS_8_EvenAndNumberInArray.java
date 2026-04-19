package day12;

import java.util.Arrays;

public class SS_8_EvenAndNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		getEvenAndOddArray(arr);
	}

	public static void getEvenAndOddArray(int[] arr) {

		int countEven = 0;
		int countOdd = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				countEven++;
			} else {
				countOdd++;
			}
		}

		int[] even = new int[countEven];
		int[] odd = new int[countOdd];

		int e = 0;
		int o = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[e++] = arr[i];
			} else {
				odd[o++] = arr[i];
			}
		}
		System.out.println("Even array is : " + Arrays.toString(even));
		System.out.println("Odd array is : " + Arrays.toString(odd));

	}
}
