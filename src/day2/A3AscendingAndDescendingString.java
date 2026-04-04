package day2;

public class A3AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		char[] arr = sortAscending(str);

		String acending = "";
		String decending = "";

		for (int i = 0; i < arr.length; i++) {
			acending = acending + arr[i];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			decending = decending + arr[i];
		}

		System.out.println("Acending " + acending);
		System.out.println("Decending " + decending);

	}

	public static char[] sortAscending(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
