package day8;

public class P1ReverseString {
	public static void main(String[] args) {
		String str = "java";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		return result;
	}
}
