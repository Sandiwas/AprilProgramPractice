package day4;

import java.util.*;

public class R1_RemoveDuplicateCharUsingSet {
	public static void main(String[] args) {
		String str = "programming";

		Set<Character> mySet = new LinkedHashSet<Character>();
		char[] arr = str.toCharArray();
		for (char ele : arr) {
			mySet.add(ele);
		}

		StringBuffer sb = new StringBuffer();

		for (char ele : mySet) {
			sb.append(ele);
		}

		System.out.println(sb.toString());

	}
}
