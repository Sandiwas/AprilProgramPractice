package day9;

public class SS_14_PalindromeNumber {
	public static void main(String[] args) {
		int n = 121;
		int remainder = 0;
		int reverse = 0;
		int temp = n;
		int sum = 0;

		while (n > 0) {
			remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n = n / 10;
			sum = sum + remainder;
		}
		if (temp == reverse) {
			System.out.println("Given number is palindrome number");
		} else {
			System.out.println("Given number is not palindrome number");
		}
	}
}
