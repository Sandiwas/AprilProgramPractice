package day2;

public class I8MissingNumberSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 1, 2, 3 };

		sortArray(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.print("Missing number is " + (i + 1));
				return;
			}
		}

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
