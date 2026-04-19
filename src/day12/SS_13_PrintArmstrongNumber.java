package day12;

import java.util.Scanner;

public class SS_13_PrintArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number where you want armstrong number : ");
		int num = sc.nextInt();
		getArmstrongNum(num);
		sc.close();
	}

	public static void getArmstrongNum(int range) {
		for (int num = 1; num <= range; num++) {
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
