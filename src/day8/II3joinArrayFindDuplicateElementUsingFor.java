package day8;


public class II3joinArrayFindDuplicateElementUsingFor {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };
		int[] merged=mergerArray(arr1, arr2);
		countDuplicateElement(merged);
	}

	public static void countDuplicateElement(int[] arr) {
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

	public static int[] mergerArray(int[] arr1, int[] arr2) {
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
