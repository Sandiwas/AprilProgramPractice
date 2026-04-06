package day3;

import java.util.ArrayList;

public class S_6_EvenAndNumberInArray {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };

		ArrayList<Integer> even = new ArrayList<Integer>();
		ArrayList<Integer> odd = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}

		System.out.print("Even number are : ");
		for (int num : even) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.print("Odd number are : ");
		for (int num : odd) {
			System.out.print(num + " ");
		}
	}
}
