package day11;

public class C2MakeUpperCaseString {
	public static void main(String[] args) {
		
		String str = "AuToMaTiOn";
		System.out.println(makeLowerCase(str));
	}

	public static String makeLowerCase(String str) {
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
