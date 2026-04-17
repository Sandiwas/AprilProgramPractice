package day11;

public class C11AscendingAndDescendingString {

	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		
		str = acendingOrder(str);
		System.out.println("Acending order string " + str);
		
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		
		System.out.println("Decending order string " + result);

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
		String result = " ";
		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}

}
