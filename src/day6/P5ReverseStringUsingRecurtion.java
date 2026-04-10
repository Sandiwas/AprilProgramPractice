package day6;

public class P5ReverseStringUsingRecurtion {
	public static void main(String[] args) {

		String str = "Automation is fun";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		if (str.length() == 0) {
			return str;
		}
		return reverseString(str.substring(1)) + str.charAt(0);
	}
}
