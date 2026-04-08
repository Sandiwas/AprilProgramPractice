package day4;

public class PD6_DuplicateElementInUsingFor {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 6, 3, 1 };

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