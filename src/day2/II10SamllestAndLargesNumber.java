package day2;

public class II10SamllestAndLargesNumber {
	public static void main(String[] args) {
		int[] arr = { 3, 4, 3, 2, 4, 6, 5, 9, 1 };

		int largest = arr[0];
		int smalllest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			} else {
				if (arr[i] < smalllest) {
					smalllest = arr[i];
				}
			}
		}
		System.out.println("largest number is " + largest);
		System.out.println("smallest number is " + smalllest);
	}

}
