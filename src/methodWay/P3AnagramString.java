package methodWay;

public class P3AnagramString {
	public static void main(String[] args) {
		String str1 = "Army";
		String str2 = "Mary";
		
		str1 = removeSpaceMakeLowerCase(str1);
		str2 = removeSpaceMakeLowerCase(str2);

		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		sortArray(arr1);
		sortArray(arr2);
		
		isAnagram(arr1, arr2);

	}

	public static void isAnagram(char[] arr1, char[] arr2) {
		if (isEuqlas(arr1, arr2)) {
			System.out.println("Given String is Anagram");
		} else {
			System.out.println("Givem String is not palindrome");
		}
	}

	public static boolean isEuqlas(char[] arr1, char[] arr2) {
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
				if (arr[i] > arr[j+1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
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
