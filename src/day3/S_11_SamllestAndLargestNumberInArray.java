package day3;

public class S_11_SamllestAndLargestNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		int smallest = arr[0];
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < smallest) {
				smallest = arr[i];
			} else if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		System.out.println("Smallest number in array is :"+smallest);
		System.out.println("Largest number in array is :"+largest);

	}
