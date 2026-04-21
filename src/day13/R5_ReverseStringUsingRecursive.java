package day13;

public class R5_ReverseStringUsingRecursive {
	public static void main(String[] args) {
		String str = "java";
		System.out.println(reverse(str));
	}

	public static String reverse(String str) {
		if (str.length() == 0) {
			return str;
		}
		return reverse(str.substring(1)) + str.charAt(0);
	}
}
