package day13;

public class A5_MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		sortArray(arr);
		findMissingNumber(arr);
	}

	public static void findMissingNumber(int[] arr) {
		int missingNumber = 1;
		for (int i = 0; i < arr.length; i++) {
			// Skip duplicates
			if (i > 0 && arr[i] == arr[i + 1]) {
				continue;
			}
			// Check missing number
			if (arr[i] != missingNumber) {
				System.out.println("Missing number is : " + missingNumber);
				return;
			}
			missingNumber++;
		}
		System.out.println("if not found missing number in array then Missing number is : " + (arr.length + 1));

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
