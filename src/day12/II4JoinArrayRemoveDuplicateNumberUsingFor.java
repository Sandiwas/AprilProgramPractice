package day12;



public class II4JoinArrayRemoveDuplicateNumberUsingFor {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4 };
		int[] arr2 = { 3, 4, 5, 6 };
		int[] merged = mergerArray(arr1, arr2);
		removeDuplicateElement(merged);

	}

	public static void removeDuplicateElement(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
				}
			}
			if (arr[i] != -1) {
				System.out.print(arr[i] + " ");
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
