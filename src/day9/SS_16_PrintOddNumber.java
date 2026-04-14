package day9;

public class SS_16_PrintOddNumber {
	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
