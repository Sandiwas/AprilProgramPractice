package day8;

public class SS_1_CheckPrimeNumber {
	public static void main(String[] args) {
		if (isPrime(2)) {
			System.out.println("prime number");
		} else {
			System.out.println("Not prime number");
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return true;
		}
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
