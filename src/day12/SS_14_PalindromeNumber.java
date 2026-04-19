package day12;

import java.util.Scanner;

public class SS_14_PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check palindrome number : ");
		int n = sc.nextInt();
		checkPalindromeNumber(n);
		sc.close();
	}

	public static void checkPalindromeNumber(int n) {
		int num = n;
		int remainder = 0;
		int reverse = 0;
		int sum = 0;
		int temp = num;

		while (num > 0) {
			remainder = num % 10;
			reverse = reverse * 10 + remainder;
			num = num / 10;
			sum = sum + remainder;
		}
		if (temp == reverse) {
			System.out.println("" + temp + " is palindrome number");
		} else {
			System.out.println("" + temp + " is palindrome not number");
		}
		System.out.println("" + temp + " sum of digit is : " + sum);
	}
}
