package day6;

public class I9MissingNumberSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 1, 2, 7, 3 };
		sortArray(arr);
		int expected = 1;
		for (int i = 0; i < arr.length; i++) {
			// Skip duplicates
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			// Check missing number

			if (arr[i] != expected) {
				System.out.println("Missing number is " + expected);
				return;
			}
			expected++;
		}
		// Handle last missing case
		System.out.print("No number missing in given array");
	}

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
