package day2;

public class I5FindSecondLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 25, 30, 10, 26 };
		if (arr.length < 3) {
			System.out.print("Invalid input");
		}
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				second = largest;
				third = second;
				largest = arr[i];
			} 
			else if (arr[i] > second && arr[i] != largest) {
				third = second;
				second = arr[i];
			} 
			else if (arr[i] > third && arr[i] != second && arr[i] != largest)
				third = arr[i];
		}
		if (third == Integer.MIN_VALUE) {
			System.out.println("No Second largest number");
		} else {
			System.out.println(third);
		}
	}
}
