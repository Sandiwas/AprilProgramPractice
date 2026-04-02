package day1;

public class I2FindSecondLargestNumber {
	public static void main(String[] args)
	{
		int arr[] = {10, 15, 20, 20, 30, 10, 20 };

		if (arr.length < 2) {
			System.out.println("Invalid Input");
		}

		int largest = Integer.MIN_VALUE;
		int secondlargest = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondlargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondlargest && arr[i] != largest) {
				secondlargest = arr[i];
			}
		}
		if (secondlargest == Integer.MIN_VALUE) {
			System.out.print("No second Largest Element");
		} else {
			System.out.print(secondlargest);
		}

	}
}
