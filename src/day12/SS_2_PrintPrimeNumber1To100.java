package day12;

import java.util.Scanner;

public class SS_2_PrintPrimeNumber1To100 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number where you want prime number : ");

		int n = sc.nextInt();

		printPrimeNumber(n);
		sc.close();
	}

	public static void printPrimeNumber(int n) {
		int s;
		for (int i = 2; i <= n; i++) {
			s = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					s = 1;
					break;
				}
			}
			if (s == 0) {
				System.out.print(i + " ");
			}
		}
	}
}
