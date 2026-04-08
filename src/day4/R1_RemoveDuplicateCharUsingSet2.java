package day4;

import java.util.*;

public class R1_RemoveDuplicateCharUsingSet2 {
	public static void main(String[] args) {
		String str = "programming".toLowerCase();
		System.out.println(removeDuplicateChar(str));
	}

	public static String removeDuplicateChar(String str) {
		Set<Character> mySet = new LinkedHashSet<Character>();
		char[] arr = str.toCharArray();
		for (char ele : arr) {
			mySet.add(ele);
		}

		StringBuffer sb = new StringBuffer();

		for (char ele : mySet) {
			sb.append(ele);
		}

		return sb.toString();

	}
}
