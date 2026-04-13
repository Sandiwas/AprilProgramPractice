package day8;

public class C12AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		char[] arr = sortAcendingOrder(str);
		String acending = "";
		for (int i = 0; i < arr.length; i++) {
			acending += arr[i];
		}
		System.out.println("Acending order " + acending);

		String decending = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			decending += arr[i];
		}
		System.out.println("Decending order " + decending);

	}

	public static char[] sortAcendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
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
