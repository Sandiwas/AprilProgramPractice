package day10;

import java.util.LinkedHashMap;
import java.util.Map;

public class PD2_DuplicateWordInSentence {
	public static void main(String[] args) {
		String str = "I am learning learning Java java";
		str = makeLowerCase(str);
		countDuplicateString(str);
	}

	public static void countDuplicateString(String str) {
		String[] arr = str.split(" ");
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
