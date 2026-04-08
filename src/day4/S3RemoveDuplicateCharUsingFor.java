package day4;

public class S3RemoveDuplicateCharUsingFor {
	public static void main(String[] args) {
		String str = "Sandip Gahudas Wasekar";
		System.out.println(removeSpaceMakeLowerCase(str));
		str = removeSpaceMakeLowerCase(str);
		
		char[] arr = str.toCharArray();
		System.out.println(removeDuplicateChar(arr));

	}

	public static String removeDuplicateChar(char[] arr) {
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == '0') {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[j] = '0';
				}
			}

			if (arr[i] != '0') {
				result = result + arr[i];
			}
		}
		return result;
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
