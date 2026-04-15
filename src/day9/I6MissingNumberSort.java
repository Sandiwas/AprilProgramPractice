package day9;

public class I6MissingNumberSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 1, 3, 2 };
		bubbleSort(arr);
		int missingNumber = 1;

		for (int i = 0; i < arr.length; i++) {

			// Skip duplicates
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}

			// Check missing number
			if (arr[i] != missingNumber) {
				System.out.println("Missing number in array is " + missingNumber);
				return;
			}
			missingNumber++;

		}

		// Handle last missing case
		System.out.println("Missing number in array is " + missingNumber);
	}

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
