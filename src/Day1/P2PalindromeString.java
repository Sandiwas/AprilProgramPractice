package Day1;

public class P2PalindromeString {
	public static void main(String[] args) {
		String str = "radA r";
		str = removSpaceMakeLowerCase(str);
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}

		if (str.equals(result)) {
			System.out.println("Given String is plaindrome");
		} else {
			System.out.println("Givcen string is not plaindrome");
		}
	}

	public static String removSpaceMakeLowerCase(String str) {
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
