package day4;

import java.util.*;

public class R7_RemoveDuplicateStringUsingSet {
	public static void main(String[] args) {
		String[] arr = { "java", "ruby", "js", "java", "ruby", "js", "js" };
		System.out.println("\n"+removeDulicate(arr));
	}

	public static Set<String> removeDulicate(String[] arr) {
		Set<String> mySet = new LinkedHashSet<String>();

		for (String ele : arr) {
			mySet.add(ele);
		}
		Iterator<String> itr = mySet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		return mySet;
	}
}
