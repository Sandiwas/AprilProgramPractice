package Day1;

import java.util.Arrays;

public class II3joinArrayFindDuplicateElementUsingFor {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };

		System.out.println(Arrays.toString(mergeArray(arr1, arr2)));
		int[] arr = mergeArray(arr1, arr2);
		countDuplicate(arr);
	}

	public static void countDuplicate(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			if (count > 1 && arr[i] != -1) {
				System.out.println(arr[i] + " = " + count);
			}
		}
	}

	public static int[] mergeArray(int[] arr1, int[] arr2) {
		int[] result = new int[arr1.length + arr2.length];

		for (int i = 0; i < arr1.length; i++) {
			result[i] = arr1[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			result[arr1.length + i] = arr2[i];
		}
		return result;
	}
}

//[1, 2, 3, 4, 3, 4, 5, 6]
//3 = 2
//4 = 2
