package day10;

public class P6AnagramString {
	public static void main(String[] args) {
		String str1 = "arm Y";
		String str2 = "ma Ry";
		str1=removeSpaceMakeLowerCase(str1);
		str2=removeSpaceMakeLowerCase(str2);

	}

	public static String removeSpaceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		String finalResult = "";
		for (int i = 0; i < result.length(); i++) {
			char ch = result.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			finalResult = finalResult + ch;
		}
		return finalResult;
	}
}
