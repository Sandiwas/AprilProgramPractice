package day4;

import java.util.ArrayList;

public class R2_RemoveDuplicateCharUsingArrayList {
	public static void main(String[] args) {
		String str = "programming".toLowerCase();
		System.out.println(removeDuplicateChar(str));
	}

	public static String removeDuplicateChar(String str) {
		
		char[] arr = str.toCharArray();
		ArrayList<Character> list = new ArrayList<Character>();

		for (char ele : arr) {
			if (!list.contains(ele)) {
				list.add(ele);
			}
		}
		StringBuffer sb = new StringBuffer();
		for (char ch : list) {
			sb.append(ch);
		}
		return sb.toString();
	}

}
