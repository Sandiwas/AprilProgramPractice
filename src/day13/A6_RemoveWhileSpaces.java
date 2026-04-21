package day13;

public class A6_RemoveWhileSpaces {
	public static void main(String[] args) {
		String str = "s a n d i P   ";
		str = str.replaceAll("\\s", "");
		str = makeLowerCase(str);
		System.out.println(str);
		str = makeUpperCase(str);
		System.out.println(str);
	}

	public static String makeLowerCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			result = result + ch;
		}
		return result;
	}

	public static String makeUpperCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'a' && ch <= 'z') {
				ch = (char) (ch - 32);
			}
			result = result + ch;
		}
		return result;
	}
}
