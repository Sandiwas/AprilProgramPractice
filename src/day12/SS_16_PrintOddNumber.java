package day12;

import java.util.Scanner;

public class SS_16_PrintOddNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.err.print("Enter number where you want odd number : ");
		int n = sc.nextInt();
		printOddNum(n);
		sc.close();
	}

	public static void printOddNum(int n) {
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}


}
