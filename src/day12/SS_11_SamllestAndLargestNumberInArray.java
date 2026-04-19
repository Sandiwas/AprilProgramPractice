package day12;

public class SS_11_SamllestAndLargestNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		getsmallestAndLargestNumber(arr);
	}

	public static void getsmallestAndLargestNumber(int[] arr) {
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			} else if (arr[i] > largest) {
				largest = arr[i];
			}
		}

		System.out.println("smallest number in array : " + smallest);
		System.out.println("largest number in array : " + largest);
	}
}
