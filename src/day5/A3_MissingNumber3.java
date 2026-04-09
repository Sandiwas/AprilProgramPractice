package day5;

public class A3_MissingNumber3 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		sortArray(arr);
		int expected = 1;
		for (int i = 0; i < arr.length; i++) {
			// Skip duplicates
			if (i > 0 && arr[i] == arr[i + 1]) {
				continue;
			}
			if (arr[i] != expected) {
				System.out.println(i + 1);
				return;
			}
			expected++;
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
