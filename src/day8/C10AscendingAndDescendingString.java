package day8;

public class C10AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";

		System.out.println("Acending order String : " + sortAcendingOrder(str));
		System.out.println("Acending order String : " + sortDecendingOrder(str));
	}

	public static String sortAcendingOrder(String str) {
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
		return new String(arr);
	}

	public static String sortDecendingOrder(String str) {
		char[] arr = str.toCharArray();

		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return new String(arr);
	}
}
