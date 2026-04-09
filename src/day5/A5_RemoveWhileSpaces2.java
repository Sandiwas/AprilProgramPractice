package day5;

public class A5_RemoveWhileSpaces2 {
	public static void main(String[] args) {
		String str = "S a n d i p";
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		System.out.println(result);
	}
}
