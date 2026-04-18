package day12;

import java.util.Arrays;

public class II5JoinArrayRemoveDuplicateNumberUsingForOPInArray {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };

		int[] merged = mergeArray(arr1, arr2);

		removeDuplicate(merged);
	}

	public static void removeDuplicate(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
				}
			}
		}
		int index = 0;
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != -1) {
				temp[index++] = arr[i];
			}
		}

		int[] result = new int[index];
		for (int i = 0; i < index; i++) {
			result[i] = temp[i];
		}
		System.out.println(Arrays.toString(result));

	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		for (int i = 0; i < arr1.length; i++) {
			merged[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			merged[arr1.length + i] = arr2[i];
		}
		return merged;
	}
}
