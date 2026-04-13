package day8;

public class C7SepratUpperCaseAndSmallCaseLetter {
	public static void main(String[] args) {

		String str = "SDFA3jdjdn3765678#$%^#";

		String uppercase = "";
		String lowerCase = "";
		String number = "";
		String symbol = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (ch >= 'A' && ch <= 'Z') {
				uppercase += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase += ch;
			} else if (ch >= '0' && ch <= '9') {
				number += ch;
			} else {
				symbol += ch;
			}
		}
		System.out.println(uppercase + " ");
		System.out.println(lowerCase + " ");
		System.out.println(number + " ");
		System.out.println(symbol + " ");
	}
}
