package day10;

public class PP18 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			for (int j = 2; j <= i; j++) {
				System.out.print(" ");
			}
			char ch = (i % 2 == 0) ? '*' : '&';
			for (int k = 4; k >= i; k--) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
