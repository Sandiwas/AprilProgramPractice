package day10;

public class S4RemoveDuplcateWordInSentenceUsingFor {
	public static void main(String[] args) {
		String str = "Sandip gahuadas Wasekar sandip GAhuadas";
		str = makeLowerCase(str);
		System.out.println(removeDuplicateString(str));
	}

	public static String removeDuplicateString(String str) {
		String result = "";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("0")) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					arr[j] = "0";
				}
			}
			if (!arr[i].equals("0")) {
				result = result + arr[i]+" ";
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
