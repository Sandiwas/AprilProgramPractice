package day10;

import java.util.ArrayList;

public class R2_RemoveDuplicateCharUsingArrayList {
	public static void main(String[] args) {
		String str = "programmiNG";
		System.out.println(makeLowerCase(str));
		str = makeLowerCase(str);
		System.out.println(removeDuplicateChar(str));
	}

	public static String removeDuplicateChar(String str) {
		char[] arr = str.toCharArray();

		ArrayList<Character> list = new ArrayList<Character>();

		for (int i = 0; i < arr.length; i++) {
			if (!list.contains(arr[i])) {
				list.add(arr[i]);
			}
		}

		StringBuffer sb = new StringBuffer();
		for (char ch : list) {
			sb.append(ch);
		}
		return sb.toString();
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
}


//programming
//progamin
