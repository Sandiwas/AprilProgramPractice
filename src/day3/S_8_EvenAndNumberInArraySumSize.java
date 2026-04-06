package day3;

import java.util.ArrayList;

public class S_8_EvenAndNumberInArraySumSize {
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
		System.out.print("Even number are :");

		for (int num : even) {
			sum1 += num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Sum of all  even numebr is " + sum1);
		System.out.println("Total number if even number is " + even.size());
		System.out.print("Odd number are :");
		for (int num : odd) {
			sum2 += num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Sum of all  odd numebr is " + sum2);
		System.out.println("Total number if odd number is " + odd.size());
	}
}
