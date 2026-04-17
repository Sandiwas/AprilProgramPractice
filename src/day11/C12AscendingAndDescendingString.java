package day11;

public class C12AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";

		char[] arr1 = acendingOrder(str);

		String acending = "";
		for (int i = 0; i < arr1.length; i++) {
			acending = acending + arr1[i];
		}
		System.out.println(acending + " ");

		String decending = "";
		for (int i = arr1.length - 1; i >= 0; i--) {
			decending = decending + arr1[i];
		}
		System.out.println(decending + " ");
	}

	public static char[] acendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char ch = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = ch;
				}
			}
		}
		return arr;
	}
}
