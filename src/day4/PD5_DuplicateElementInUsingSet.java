package day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PD5_DuplicateElementInUsingSet {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 2, 6, 3, 1 };
		Set<Integer> mySet = new LinkedHashSet<Integer>();
		for (int ele : arr)
			if (!mySet.add(ele)) {
				System.out.println(ele);
			}
		System.out.println(mySet);
	}
}
