package methodWay;

public class P1ReverseString {

	public static void main(String[] args) {
		String str = "jav a";
		str = removeSpace(str);
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}

	public static String removeSpace(String str) {
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
