package day9;

public class SS_1_CheckPrimeNumber {
	public static void main(String[] args) {
		if (isPrime(4)) {
			System.out.println("Given number is prime number");
		} else {
			System.out.println("Given number is not prime number");
		}
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
