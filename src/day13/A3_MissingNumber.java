package day13;

public class A3_MissingNumber {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 4, 5 };
		findMissingNumber(arr);
	}

	public static void findMissingNumber(int[] arr) {
		int n = arr.length + 1;

		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		for (int j = 0; j <= n; j++) {
			sum2 = sum2 + j;
		}
		System.out.println("Missing number is :" + (sum2 - sum1));

	}
}
