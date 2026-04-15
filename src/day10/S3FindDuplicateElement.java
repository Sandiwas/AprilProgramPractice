package day10;

public class S3FindDuplicateElement {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 4, 3, 5, 6, 6, 6 };
		countDuplicateElement(arr);
	}

	public static void countDuplicateElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = -1;
				}
			}
			if (count > 1 && arr[i] != -1) {
				System.out.println(arr[i] + " = " + count);
			}
		}
	}
}
