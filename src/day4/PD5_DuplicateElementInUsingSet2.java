package day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class PD5_DuplicateElementInUsingSet2 {
	public static void main(String[] args) {
		String str = "I am learning learning java java";
		String[] arr = str.split(" ");
		
		Set<String> mySet = new LinkedHashSet<String>();
		
		for (String ele : arr)
			if (!mySet.add(ele)) {
				System.out.println(ele);
			}
		System.out.println(mySet);
	}
}
