package day3;

public class S_1_CheckPrimeNumber {
	public static void main(String[] args) {
	if (isPrime(10)) {
			System.out.println("Given number is prime");
		} else {
			System.out.println("Given number is not prime");
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
