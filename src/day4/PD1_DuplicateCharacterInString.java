package day4;
import java.util.LinkedHashMap;
import java.util.Map;

public class PD1_DuplicateCharacterInString {
	public static void main(String[] args) {
		String str = "Programming";
		str = removeSpaceMakeLowerCase(str);

		char[] arr = str.toCharArray();

		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		int count = 1;
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

	public static String removeSpaceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != ' ') {
				result = result + arr[i];
			}
		}
		return result.toLowerCase();
	}
}
