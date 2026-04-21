package day13;

public class R2_PalindromeReverseString {
	public static void main(String[] args) {
		String str = "rAd  aZ";
		str = removeSpaceMakeLowerCase(str);
		isPalindrome(str);
	}

	public static void isPalindrome(String str) {
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
		char[] arr = str.toCharArray();
		String removeSpace = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				removeSpace = removeSpace + arr[i];
			}
		}

		String lowerCase = "";
		for (int i = 0; i < removeSpace.length(); i++) {
			char ch = removeSpace.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			lowerCase = lowerCase + ch;
		}
		return lowerCase;
	}
}
