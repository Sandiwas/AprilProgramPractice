package day3;

public class PP25{
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {

			for (int j = 3; j >= i; j--) {
				System.out.print(" ");
			}
			char ch = (i % 2 == 0) ? '*' : '&';
			for (int k = 1; k <= i; k++) {
				System.out.print(ch);
			}
			System.out.println();
		}
		for (int i = 1; i <= 3; i++) {
			char ch = (i % 2 == 0) ? '*' : '&';
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 3; j >= i; j--) {
				System.out.print(ch);
			}
			System.out.println("");
		}
	}
}
