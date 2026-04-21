package day13;

public class R6_AnagramString {
	public static void main(String[] args) {
		String str1 = "yrm A";
		String str2 = "Ma r Z";
		str1 = removeSpaceMakeLowerCase(str1);
		str2 = removeSpaceMakeLowerCase(str2);

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		sortArray(arr1);
		sortArray(arr2);
		isAnagramString(arr1, arr2);

	}

	public static void isAnagramString(char[] arr1, char[] arr2) {
		if (isEqulas(arr1, arr2)) {
			System.out.println("Given string are anagram ");
		} else {
			System.out.println("Given string are not anagram string");
		}
	}

	public static boolean isEqulas(char[] arr1, char[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void sortArray(char[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

	}

	public static String removeSpaceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String removeSpace = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				removeSpace = removeSpace + arr[i];
			}
		}

		String lowerCase = "";
		for (int i = 0; i < removeSpace.length(); i++) {
			char ch = removeSpace.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			lowerCase = lowerCase + ch;
		}
		return lowerCase;
	}
}
