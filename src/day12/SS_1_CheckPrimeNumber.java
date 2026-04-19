package day12;

import java.util.*;

public class SS_1_CheckPrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check prime number or not : ");
		int n = sc.nextInt();

		if (isPrime(n)) {
			System.out.println("" + n + " is prime number");

		} else {
			System.out.println("" + n + " is prime not number");
		}
		sc.close();
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
