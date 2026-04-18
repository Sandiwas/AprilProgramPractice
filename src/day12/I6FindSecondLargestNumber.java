package day12;

public class I6FindSecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = { 10, 15, 22, 21, 30, 10, 20 };
		secondLargestNumber(arr);
	}

	public static void secondLargestNumber(int[] arr) {
		if (arr.length < 2) {
			System.out.println("Invalid input");
			return;
		}

		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				largest = arr[i];
			} else if (arr[i] > second && arr[i] != largest) {
				second = arr[i];
			}
		}

		if (second == Integer.MIN_VALUE) {
			System.out.println("No sencond largest number");
		} else {
			System.out.println("Second largest number is " + second);
		}
	}
}
