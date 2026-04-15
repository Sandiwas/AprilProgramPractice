package day10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class R4_RemoveDuplicateEleUsingSet {
	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 4, 3, 5, 6, 6, 6 };
		removeDuplicateElement(arr);
	}

	public static void removeDuplicateElement(int[] arr) {

		Set<Integer> mySet = new LinkedHashSet<Integer>();
		for (int ele : arr) {
			mySet.add(ele);
		}
		Iterator<Integer> itr = mySet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		System.out.println("\n" + mySet);
	}
}
