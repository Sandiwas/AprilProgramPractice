package day3;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "radar";
		String result = "";
		str = removeSpaceMakeLowerCase(str);

		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		if (str.equals(result)) {
			System.out.println("Given String is Plaindrome");
		} else {
			System.out.println("Given String is not Plaindrome");
		}
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
