package day12;

public class SS_10_LargestNumberInArray {
	public static void main(String[] args) {

		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		System.out.println("Largest number in array is : " + getSmallestNum(arr));
	}

	public static int getSmallestNum(int[] arr) {
		int largest = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				largest = arr[i];
			}
		}
		return largest;

	}

}
