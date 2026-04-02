package day2;

public class I5FindSecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 20, 30, 10, 20 };
		if (arr.length < 2) {
			System.out.print("Invalid input");
		}
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		if (secondLargest == Integer.MIN_VALUE) {
			System.out.println("No Second largest number");
		} else {
			System.out.println(secondLargest);
		}
	}
}
