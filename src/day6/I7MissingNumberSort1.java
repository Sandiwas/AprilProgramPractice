package day6;

public class I7MissingNumberSort1 {
	public static void main(String[] args) {
		int[] arr = { 5, 4, 2, 3 };
		
		int n = arr.length + 1;
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 = sum1 + arr[i];
		}
		for (int i = 1; i <= n; i++) {
			sum2 = sum2 + i;
		}
		System.out.println(sum2 - sum1);
	}
}
