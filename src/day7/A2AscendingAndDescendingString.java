package day7;

import java.util.Arrays;

public class A2AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		System.out.println(Arrays.toString(str.toCharArray()));
		System.out.println("Acending order : "+SortString(str));

		str = SortString(str);
		// Decending order
		String result = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			result = result + str.charAt(i);
		}
		System.out.println("Decending order : "+result);
	}

	public static String SortString(String str) {
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
}
