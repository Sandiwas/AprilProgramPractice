package day10;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class PD4_DuplicateWordInArray {
	public static void main(String[] args) {
		String[] arr = { "pune", "punE", "mumBai", "muMbai", "chennai", "chennai", "chennai" };
		System.out.println(Arrays.toString(makeLowerCaseArray(arr)));
		arr = makeLowerCaseArray(arr);
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

	public static String[] makeLowerCaseArray(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String result = "";
			for (int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if (ch > 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}
				result = result + ch;
			}
			arr[i] = result;
		}
		return arr;
	}
}
