package day5;

public class R2_PalindromeReverseString {
	public static void main(String[] args) {
		String str = "rAd  aR";
		System.out.println(removeSpaceMakeLowerCase(str));
		str = removeSpaceMakeLowerCase(str);

		if (str.equals(reverseSrting(str))) {
			System.out.println("Given string is palindrome String");
		} else {
			System.out.println("Given String is not plaindrome String");
		}
	}

	public static String reverseSrting(String str) {
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
