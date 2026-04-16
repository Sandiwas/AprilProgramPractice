package day10;

public class PP13 {
	public static void main(String[] args) {
		for (int i = 1; i <= 4; i++) {
			char ch = (i % 2 == 0) ? '&' : '*';
			for (int j = 1; j <= 4; j++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}
}
