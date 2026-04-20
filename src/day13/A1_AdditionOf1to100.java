package day13;

import java.util.ArrayList;
import java.util.Iterator;

public class A1_AdditionOf1to100 {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
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
		sum(list);
	}

	public static void sum(ArrayList<Integer> list) {
		int result = 0;
		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			int num = itr.next();
			if (num <= 10) {
				result = result + num;
			}
		}
		System.out.println("Sum of 1 to 10 is " + result);
	}
}
