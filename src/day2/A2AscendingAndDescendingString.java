package day2;

import java.util.Arrays;

public class A2AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";

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

		System.out.println("Ascending = " + Arrays.toString(arr)); // Arrays.toString(arr) print char Array
		System.out.println("Ascending = " + new String(arr)); // new String(arr) print String

		String acending = "";
		for (int i = 0; i < arr.length; i++) {
			acending = acending + arr[i];
		}
		System.out.println("Acending String " + acending);

		String decending = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			decending = decending + arr[i];
		}
		System.out.println("Decending String " + decending);
	}
}
