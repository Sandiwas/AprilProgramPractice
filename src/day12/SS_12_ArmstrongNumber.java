package day12;

import java.util.Scanner;

public class SS_12_ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number :");
		int num = sc.nextInt();
		checkArmstringNmber(num);
		sc.close();
	}

	public static void checkArmstringNmber(int num) {
		int n = num;
		int a;
		int c = 0;
		int temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println("" + temp + " is armstrong number");
		} else {
			System.out.println("" + temp + " is armstrong not number");
		}

	}
}
