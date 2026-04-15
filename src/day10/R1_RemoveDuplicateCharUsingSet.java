package day10;

import java.util.LinkedHashSet;
import java.util.Set;

public class R1_RemoveDuplicateCharUsingSet {
	public static void main(String[] args) {
		String str = "PRogramming";
		str = makeLowerCase(str);
		System.out.println(removeDuplicateChar(str));

	}

	public static String removeDuplicateChar(String str) {
		char[] arr = str.toCharArray();
		Set<Character> mySet = new LinkedHashSet<Character>();
		for (char ch : arr) {
			mySet.add(ch);
		}
		StringBuffer sb = new StringBuffer();
		for (char ch : mySet) {
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
