package day11;

public class P5ReverseStringUsingRecurtion {

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
