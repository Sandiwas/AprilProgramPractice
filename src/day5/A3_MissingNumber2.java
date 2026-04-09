package day5;

public class A3_MissingNumber2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		sortArray(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.println(i + 1);
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
