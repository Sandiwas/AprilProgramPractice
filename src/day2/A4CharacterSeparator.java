package day2;

public class A4CharacterSeparator {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";

		String UpperCaseletters = "";
		String LowerCaseletters = "";
		String numbers = "";
		String symboles = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				UpperCaseletters += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				LowerCaseletters += ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else {
				symboles += ch;
			}
		}
		System.out.println("UpperCase letter : " + UpperCaseletters);
		System.out.println("LowerCase letter :  " + LowerCaseletters);
		System.out.println("Numbers  : " + numbers);
		System.out.println("Symboles : " + symboles);

	}
}
