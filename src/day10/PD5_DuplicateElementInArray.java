package day10;

import java.util.LinkedHashMap;
import java.util.Map;

public class PD5_DuplicateElementInArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 1, 5, 2, 6, 3, 1 };
		countDuplicateElement(arr);
	}

	public static void countDuplicateElement(int[] arr) {
		int count = 1;
		Map<Integer, Integer> map = new LinkedHashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], map.get(arr[i]) + count);
			}
		}
		for (int key : map.keySet()) {
			if (map.get(key) > 1)
				System.out.println(key + " = " + map.get(key));
		}
	}
}
