package day4;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class R3_RemoveDuplicateStringUsingSet {
	public static void main(String[] args) {
		
		String str = "I am Sandip Sandip";
		String[] arr = str.split(" ");
		
		Set<String> mySet = new LinkedHashSet<String>();
		
		for (String ele : arr) {
			mySet.add(ele);
		}

		Iterator<String> itr = mySet.iterator();
		
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println(mySet);
	}
}
