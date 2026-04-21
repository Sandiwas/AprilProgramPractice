package day13;

public class A7_RemoveWhileSpaces {
	public static void main(String[] args) {
		String str = "S a n d i p";

		str = removeSpace(str);
		System.out.println(str);
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
