package day10;

import java.util.LinkedHashSet;
import java.util.Set;

public class PD7_DuplicateCharUsingSet {
	public static void main(String[] args) {
		String str = "ProGramming";
		str = makeLowerCase(str);
		char[] arr = str.toCharArray();
		Set<Character> mySet = new LinkedHashSet<Character>();
		for (char ch : arr) {
			if (!mySet.add(ch)) {
				System.out.print(ch + " ");
			}
		}
		String result = "";
		for (char ele : mySet) {
			result = result + ele;
		}
		System.out.println("\n" + result);
		System.out.println(mySet);

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
