package day12;

public class I8MissingNumberSort1 {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3 };
		findMissingNumber(arr);
	}

	public static void findMissingNumber(int[] arr) {
		int n = arr.length;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < n; i++) {
			sum1 = sum1 + arr[i];
		}
		for (int i = 1; i <= n+1; i++) {
			sum2 = sum2 + i;
		}
		System.out.println("Missing number is " + (sum2 - sum1));
	}
}
