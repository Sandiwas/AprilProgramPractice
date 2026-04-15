package day10;

import java.util.LinkedHashMap;
import java.util.Map;

public class PD1_DuplicateCharacterInString {
	public static void main(String[] args) {
		String str = "Prog  ramming";
		str = removeSpace(str);
		str = makeLowerCase(str);

		countDuplicateChar(str);
	}

	public static void countDuplicateChar(String str) {
		char[] arr = str.toCharArray();
		int count = 1;
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + count);
			}
		}
		for (char key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " = " + map.get(key));
			}
		}

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
