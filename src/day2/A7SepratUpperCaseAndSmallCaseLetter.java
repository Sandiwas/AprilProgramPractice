package day2;

public class A7SepratUpperCaseAndSmallCaseLetter {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";

		String UpperCaseletters = "";
		String LowerCaseletters = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				UpperCaseletters += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				LowerCaseletters += ch;
			}
		}
		System.out.println("UpperCase letter : " + UpperCaseletters);
		System.out.println("LowerCase letter : " + LowerCaseletters);
	}
}
