package day12;

import java.util.ArrayList;

public class SS_7_EvenAndNumberInArraySizeSum {
	public static void main(String[] args) {
		int[] arr = { 5, 6, 4, 3, 2, 7, 1 };
		getEvenAndOddNum(arr);
	}

	public static void getEvenAndOddNum(int[] arr) {
		ArrayList<Integer> even = new ArrayList<>();
		ArrayList<Integer> odd = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even.add(arr[i]);
			} else {
				odd.add(arr[i]);
			}
		}

		int sum1 = 0;
		int sum2 = 0;

		System.out.print("Even number are : ");
		for (int num : even) {
			sum1 = sum1 + num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Total size of even number " + even.size());
		System.out.println("Sum of all even number is " + sum1);

		System.out.print("Odd number are : ");
		for (int num : odd) {
			sum2 = sum2 + num;
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Total size of odd number " + odd.size());
		System.out.println("Sum of all odd number is " + sum2);
	}
}
