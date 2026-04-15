package day10;

import java.util.LinkedHashMap;
import java.util.Map;

public class PD3_DuplicateWordInArray {
	public static void main(String[] args) {
		String[] arr = { "pune", "punE", "mumBai", "muMbai", "chennai", "chennai", "chennai" };
		arr = makelowerCaseArray(arr);
		countDuplicateChar(arr);
	}

	public static void countDuplicateChar(String[] arr) {
		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		int count = 1;
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + count);
			}
		}
		for (String key : map.keySet()) {
			if (map.get(key) > 1) {
				System.out.println(key + " = " + map.get(key));
			}
		}

	}

	public static String[] makelowerCaseArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = makelowerCase(arr[i]);
		}
		return arr;
	}

	public static String makelowerCase(String str) {
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
