package day11;

public class P2PalindromeString {

	public static void main(String[] args) {
		String str = "radA r";
		str = removeSpaceMakeLowerCase(str);
		ispalindrome(str);

	}

	public static void ispalindrome(String str) {
		if (str.equals(reverseString(str))) {
			System.out.println("Given string is palindrome");
		} else {
			System.out.println("Given string is not palindrome");
		}
	}

	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	public static String removeSpaceMakeLowerCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ') {
				result = result + str.charAt(i);
			}
		}
		String finalResult = "";
		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			finalResult = finalResult + ch;
		}
		return finalResult;
	}

}
