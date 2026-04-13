package day8;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "radA r";
		str = removeSpaceMakeLowerCase(str);
		ispalindrome(str);
	}

	public static void ispalindrome(String str) {
		if (str.equals(revreseString(str))) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}
	}

	public static String revreseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	public static String removeSpaceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result.toLowerCase();
	}
}
