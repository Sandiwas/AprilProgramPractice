package day7;

public class A5CharacterSeparator {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";

		String upperCase = "";
		String lowerCase = "";
		String number = "";
		String symbol = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperCase += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase += ch;
			} else if (ch >= '0' && ch <= '9') {
				number += ch;
			} else {
				symbol += ch;
			}
		}
		System.out.println("UpperCase letter : " + upperCase);
		System.out.println("LowerCase letter :  " + lowerCase);
		System.out.println("Numbers  : " + number);
		System.out.println("Symboles : " + symbol);
	}
}
