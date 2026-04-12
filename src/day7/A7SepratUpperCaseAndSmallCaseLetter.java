package day7;

public class A7SepratUpperCaseAndSmallCaseLetter {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";
		String uppercase = "";
		String lowerCase = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				uppercase += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase += ch;
			}
		}

		System.out.println(uppercase);
		System.out.println(lowerCase);
		
	}
}
