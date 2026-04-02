package day2;

public class P6AnagramString {
	public static void main(String[] args) {
		String str1 = "a rMy";
		String str2 = "marY";
		str1 = removeSpaceMakeLowerCase(str1);
		str1 = removeSpaceMakeLowerCase(str2);
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		sortArray(arr1);
		sortArray(arr2);
		
		if (isEqulas(arr1, arr2)) {
			System.out.println("Given String is Palindrome");
		} else {
			System.out.println("Givenm string is not palindeome");
		}
	}

	public static boolean isEqulas(char[] arr1, char[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		for (int i = 0; i < arr1.length; i++) {
			if (arr2[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void sortArray(char[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[i] > arr[j]) {
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
