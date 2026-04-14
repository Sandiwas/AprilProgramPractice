package day8;

public class SS_12_ArmstrongNumber {
	public static void main(String[] args) {
		int n = 370;
		int a;
		int c = 0;
		int temp = n;

		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println("Given number is armStrong number");
		} else {
			System.out.println("Given number is not armStrong number");
		}
	}
}
