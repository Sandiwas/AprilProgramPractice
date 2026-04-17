package day11;

public class C8AscendingAndDescendingString {

	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		System.out.println(acendingOrder(str));
		System.out.println(decendingOrder(str));
	}

	public static String acendingOrder(String str) {

		char[] arr = str.toCharArray();
		int n = arr.length;
		String result = "";
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char ch = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = ch;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}

	public static String decendingOrder(String str) {

		char[] arr = str.toCharArray();
		int n = arr.length;
		String result = "";
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					char ch = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = ch;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}

}
