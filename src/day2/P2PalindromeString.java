package day2;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "radaar";
		str = removeSapceMakeLowerCase(str);
		System.out.println(str);
		isPalindromeString(str);
	}

	public static void isPalindromeString(String str) {
		if (str.equals(revreseString(str))) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Given String is not plaindrome");
		}
	}

	public static String removeSapceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result.toLowerCase();
	}

	public static String revreseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
}