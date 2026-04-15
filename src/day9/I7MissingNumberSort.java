package day9;

public class I7MissingNumberSort {

	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 1, 2 };
		bubbleSort(arr);
		int missingNumber = findMissingNumber(arr);
		System.out.println("Missing number in array is " + missingNumber);
	}

	// Method to find missing number
	public static int findMissingNumber(int[] arr) {
		int expected = 1;
		for (int i = 0; i < arr.length; i++) {
			// Skip duplicates
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			// Check missing
			if (arr[i] != expected) {
				return expected;
			}

			expected++;
		}
		// If no missing in between
		return expected;
	}

	// Bubble Sort
	public static void bubbleSort(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}