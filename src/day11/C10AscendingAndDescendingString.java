package day11;

public class C10AscendingAndDescendingString {

	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		System.out.println("Acending order is : "+acendingOrder(str));
		System.out.println("Decending order is : "+decendingOrder(str));
	}

	public static String acendingOrder(String str) {
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
		return new String(arr);
	}

	public static String decendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					char ch = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = ch;
					;
				}
			}
		}
		return new String(arr);
	}

}
