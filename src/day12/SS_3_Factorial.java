package day12;

import java.util.Scanner;

public class SS_3_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number which you want factorial : ");
		int n = sc.nextInt();
		getFactorial(n);
		sc.close();
	}

	public static void getFactorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of " + n + " is :" + fact);

	}
}
