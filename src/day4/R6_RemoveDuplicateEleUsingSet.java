package day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class R6_RemoveDuplicateEleUsingSet {
public static void main(String[] args) {
	int[] arr = { 2, 3, 4, 4, 3, 5, 6, 6, 6 };
	Set<Integer> mySet=new LinkedHashSet<>();
	
	for(int ele:arr ) {
		mySet.add(ele);
	}
	System.out.println(mySet);
}
}
