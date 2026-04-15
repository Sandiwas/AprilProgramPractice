package methodWay;

public class P4FindMissingNumber {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3, 2 };
		int[] sortArray = SortArray(arr);

		int missingNumber = findMissingnumber(sortArray);

		System.out.println(missingNumber);
	}

	public static int findMissingnumber(int[] arr) {
		int missingNumber = 1;
		for (int i = 0; i < arr.length; i++) {
			if (i > 0 && arr[i] == arr[i - 1]) {
				continue;
			}
			if (arr[i] != missingNumber) {
				return missingNumber;
			}
			missingNumber++;
		}
		return missingNumber;

	}

	public static int[] SortArray(int[] arr) {
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
		return arr;
	}
}
