package day7;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "RadaR";
		str = removeSpaceMakeLowerCase(str);
		isPalindromeString(str);
	}

	public static void isPalindromeString(String str) {
		if (str.equals(reverseString(str))) {
			System.out.println("Given String is plaindrome string");
		} else {
			System.out.println("Given String is not plaindrome string");
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
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result;
	}
}
