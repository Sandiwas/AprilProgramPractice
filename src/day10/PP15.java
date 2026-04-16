package day10;

public class PP15 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			char ch = (i % 2 == 0) ? '&' : '*';
			for (int j = 1; j <= i; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
