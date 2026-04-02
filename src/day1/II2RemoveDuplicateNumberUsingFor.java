package day1;

public class II2RemoveDuplicateNumberUsingFor {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 10, 40, 50, 20, 30, 10 };

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

//10 20 30 40 50 