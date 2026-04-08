package day4;

import java.util.LinkedHashMap;
import java.util.Map;

public class PD3_DuplicateWordInArray {

	public static void main(String[] args) {
		String[] arr = { "pune", "pune", "mumbai", "mumbai", "chennai", "chennai","chennai" };

		Map<String, Integer> map = new LinkedHashMap<>();
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

}
