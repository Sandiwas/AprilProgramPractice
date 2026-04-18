package day12;

public class I9MissingNumberSort {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3 ,1};
		sortArray(arr);
		findMissingNumber(arr);

	}

	public static void findMissingNumber(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != i + 1) {
				System.out.println("Missing number is :" + (i + 1));
				return;
			}
		}
		System.out.println("Missing number is Array : " +(arr.length+1));
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
