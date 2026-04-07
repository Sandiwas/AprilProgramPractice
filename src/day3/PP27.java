package day3;

public class PP27 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			char ch = (i % 2 == 0) ? '*' : '&';
			for (int k = 1; k <= i; k++) {
				System.out.print(ch);
			}
			char ch1 = (i % 2 == 0) ? '*' : '&';
			for (int l = 2; l <= i; l++) {
				System.out.print(ch1);
			}
			System.out.println();
		}
	}
}
