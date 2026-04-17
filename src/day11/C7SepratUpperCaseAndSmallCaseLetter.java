package day11;

public class C7SepratUpperCaseAndSmallCaseLetter {

	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";

		String lowerCase = "";
		String upperCase = "";
		String numbers = "";
		String symbol = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperCase += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase += ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else
				symbol += ch;
		}

		System.out.println(upperCase + " ");
		System.out.println(lowerCase + " ");
		System.out.println(numbers + " ");
		System.out.println(symbol + " ");
	}

}
