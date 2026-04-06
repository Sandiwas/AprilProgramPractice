package day3;

public class S_10_LargestNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		int largestNumber = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largestNumber) {
				largestNumber = arr[i];
			}
		}
		System.out.println("Largest number in array " + largestNumber);
	}
}
