package day8;

import java.util.Arrays;

public class C11AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		System.out.println("Acending order is " + SortAceandingOrder(str));
		str = SortAceandingOrder(str);
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.println("Decending order is " + result);

	}

	public static String SortAceandingOrder(String str) {
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
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result += arr[i];
		}
		return result;
	}
}
