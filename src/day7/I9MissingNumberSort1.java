package day7;

public class I9MissingNumberSort1 {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3, 2 };
		sortArray(arr);
		int missingNumber = findmissingNumber(arr);

		System.out.println("Missing number is "+missingNumber);
	}

	// Method to find missing number
	public static int findmissingNumber(int[] arr) {
		int missingNumber = 1;
		for (int i = 0; i < arr.length; i++) {
			// Skip duplicates
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			// Check missing
			if (arr[i] != missingNumber) {
				return missingNumber;
			}
			missingNumber++;
		}
		// If no missing in between
		return missingNumber;
	}

	// Bubble Sort
	public static void sortArray(int[] arr) {
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
