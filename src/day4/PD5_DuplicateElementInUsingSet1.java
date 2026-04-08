package day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PD5_DuplicateElementInUsingSet1 {
	public static void main(String[] args) {
		String str = "programming";
		char[] arr = str.toCharArray();
		Set<Character> mySet = new LinkedHashSet<Character>();
		for (char ele : arr)
			if (!mySet.add(ele)) {
				System.out.println(ele);
			}
		System.out.println(mySet);
		
		// Convert Set to String
		String result = "";
		for (char ch : mySet) {
			result = result + ch;
		}
		System.out.println(result);
	}
}
