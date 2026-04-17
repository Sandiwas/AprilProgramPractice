package day10;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "radA r";
		str = removeSpace(str);
		str = makeLowerCase(str);
		isPalindromeString(str);
	}

	public static void isPalindromeString(String str) {
		if (str.equals(reverseString(str))) {
			System.out.println("Given String is palindrome");
		} else {
			System.out.println("Given String is not  palindrome");
		}
	}

	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	public static String removeSpace(String str) {
		String result = "";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result;
	}

	public static String makeLowerCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			result = result + ch;
		}
		return result;
	}
}
