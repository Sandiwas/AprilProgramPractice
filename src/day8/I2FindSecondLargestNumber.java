package day8;

public class I2FindSecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 26, 30, 10, 20 };

		if (arr.length < 2) {
			System.out.println("Invalid Input");
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
			System.out.println("No sencond largest number in array");
		} else {
			System.out.println(second);
		}
	}
}
