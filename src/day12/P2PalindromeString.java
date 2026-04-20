package day12;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "rada R";
		str = removeSpaceMakeLowrCase(str);
		isPalindromeString(str);

	}

	public static void isPalindromeString(String str) {
		if (str.equals(reverseString(str))) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not palindrome");
		}
	}

	public static String reverseString(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse = reverse + str.charAt(i);
		}
		return reverse;
	}

	public static String removeSpaceMakeLowrCase(String str) {

		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}

		String lowerCase = "";
		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			lowerCase = lowerCase + ch;
		}
		return lowerCase;
	}
}
