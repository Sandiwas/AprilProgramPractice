package day13;

import java.util.ArrayList;
import java.util.Iterator;

public class A2_AdditionOf11to15 {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(11);
		list.add(12);
		list.add(13);
		list.add(14);
		list.add(15);
		sum(list);
	}
	public static void sum(ArrayList<Integer> list) {
		int result = 0;
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int ele = itr.next();
			if (ele > 10) {
				result = result + ele;
			}
		}
		System.out.println("Sum of 11 to 15 is : " + result);
	}
}

