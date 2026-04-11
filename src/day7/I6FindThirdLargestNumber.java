package day7;

public class I6FindThirdLargestNumber {
	public static void main(String[] args) {
		int arr[] = { 10, 15, 20, 16, 30, 10, 20 };

		if (arr.length < 3) {
			System.out.println("Invalid input");
			return;
		}
		int largest = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				third = second;
				second = largest;
				largest = arr[i];
			} else if (arr[i] > second && arr[i] != largest) {
				third = second;
				second = arr[i];
			} else if (arr[i] > third && arr[i] != second && arr[i] != largest) {
				third = arr[i];
			}
		}
		if (third == Integer.MIN_VALUE) {
			System.out.println("No third largest number in Array");
		} else {
			System.out.println(third);
		}
	}
}
