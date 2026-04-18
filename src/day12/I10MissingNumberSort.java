package day12;

public class I10MissingNumberSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3 };
		sortArray(arr);
		getmissingNumber(arr);
	}

	public static void getmissingNumber(int[] arr) {

		int missingNumber = 1;
		for (int i = 0; i < arr.length; i++) {
			// Skip duplicates
			if (i > 0 && arr[i] != arr[i - 1]) {
				continue;
			}
			// check missing
			if (arr[i] != missingNumber) {
				System.out.println("Missing number is : " + missingNumber);
				return;
			}
			missingNumber++;
		}
		// If no missing in between
		System.out.println("Edge case Missing number is : " + (arr.length + 1));

	}

	public static void sortArray(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
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
