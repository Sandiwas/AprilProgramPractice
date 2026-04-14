package day8;

public class SS_13_PrintArmstrongNumber {
	public static void main(String[] args) {
		for (int num = 1; num <= 1000; num++) {
			int a;
			int c = 0;
			int temp = num;

			int digit = String.valueOf(num).length();

			while (temp > 0) {
				a = temp % 10;
				temp = temp / 10;
				c += Math.pow(a, digit);
			}

			if (num == c) {
				System.out.print(num + " ");
			}

		}
	}
}
