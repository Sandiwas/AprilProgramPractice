package day10;

public class S6RemoveDuplicateElement {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 4, 3, 5, 6, 6, 6 };
		removeDuplicateElement(arr);
	}

	public static void removeDuplicateElement(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == -1) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = -1;
				}
			}

			if (arr[i] != -1) {
				System.out.print(arr[i] + " ");
			}
		}
	}
}
