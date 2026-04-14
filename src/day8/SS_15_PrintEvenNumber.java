package day8;

public class SS_15_PrintEvenNumber {
	public static void main(String[] args) {
		int n = 100;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
