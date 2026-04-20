package jcPattern;

public class PP1 {

	public static void main(String[] args) {
		int n = 5;
		int rowcount = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = n - 1; j >= i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= rowcount; k++) {
				System.out.print(rowcount + " ");
			}
			System.out.println();
			rowcount++;
		}

	}

}
