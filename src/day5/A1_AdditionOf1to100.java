package day5;

import java.util.ArrayList;
import java.util.Iterator;

public class A1_AdditionOf1to100 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		System.out.println(sum(list));
	}

	public static int sum(ArrayList<Integer> list) {
		int result = 0;
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			int ele = itr.next();
			if (ele <= 10) {
				result = result + ele;
			}
		}
		return result;
	}
}
