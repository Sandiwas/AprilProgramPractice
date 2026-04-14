package day9;

import java.util.ArrayList;

public class SS_7_EvenAndNumberInArraySizeSum {
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
		int sum1 = 0;
		int sum2 = 0;
		System.out.print("even numbers are :");
		for (int ele : even) {
			System.out.print(ele + " ");
			sum1 = sum1 + ele;
		}
		System.out.println();
		System.out.println("Total number of even number in array " + even.size());
		System.out.println("Sum of all even number in array " + sum1);

		System.out.print("odd numbers are :");
		for (int ele : odd) {
			System.out.print(ele + " ");
			sum2 = sum2 + ele;
		}
		System.out.println();
		System.out.println("Total number of odd number in array " + odd.size());
		System.out.println("Sum of all odd number in array " + sum2);

	}
}
