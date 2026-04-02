package day2;

public class P1ReverseString {
	public static void main(String[] args) {
		String str = "java";
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.print(result);
	}
}
