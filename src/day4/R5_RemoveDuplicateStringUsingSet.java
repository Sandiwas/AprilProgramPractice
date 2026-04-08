package day4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;


public class R5_RemoveDuplicateStringUsingSet {
	public static void main(String[] args) {
		String[] arr = { "java", "ruby", "js", "java", "ruby", "js", "js" };

		Set<String> mySet = new LinkedHashSet<String>();
		for (String ele : arr) {
			mySet.add(ele);
		}
		Iterator<String> itr = mySet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("\n"+mySet);
	}
}
