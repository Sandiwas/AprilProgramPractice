package Day1;

import java.util.Arrays;

public class II4JoinArrayRemoveDuplicateNumberUsingFor {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };

		int[] merged = merge(arr1, arr2);
		System.out.println(Arrays.toString(merge(arr1, arr2)));
		removeDuplicateOccrance(merged);

	}

	public static void removeDuplicateOccrance(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
				}
			}
			if(arr[i] != -1) {
				System.out.print(arr[i]+" ");
			}
		}
	}

	public static int[] merge(int[] arr1, int[] arr2) {
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

//
//[1, 2, 3, 4, 3, 4, 5, 6]
//1 2 3 4 5 6 