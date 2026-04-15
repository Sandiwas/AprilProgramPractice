package day10;

public class S5RemoveDuplicateCharUsingFor {
	public static void main(String[] args) {
		String str = "Sandip Gahudas Wasekar";
		str = makeLowerCase(str);
		str = removeSpace(str);
		System.out.println(removeDuplicateChar(str));

	}

	public static String removeDuplicateChar(String str) {
		String result = "";
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = '0';
				}
			}
			if (arr[i] != 0) {
				result = result + arr[i];
			}
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

	public static String makeLowerCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			result = result + ch;
		}
		return result;
	}
}
