package day13;

public class A4_MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		sortArray(arr);
		findMissingNumber(arr);
	}

	public static void findMissingNumber(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.println(i + 1);
				return;
			}
		}
		System.out.println("No missing number in array " + (arr.length + 1));

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
