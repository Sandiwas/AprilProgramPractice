package day10;

public class S1FindDuplicateCharUsingFor {
	public static void main(String[] args) {
		String str = "PrograMMing";
		str = makeLowerCase(str);
		countDuplicateChar(str);
	}

	public static void countDuplicateChar(String str) {
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i] == '0') {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					arr[j] = '0';
				}
			}
			if (count > 1 && arr[i] != '0') {
				System.out.println(arr[i] + " = " + count);
			}
		}
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
