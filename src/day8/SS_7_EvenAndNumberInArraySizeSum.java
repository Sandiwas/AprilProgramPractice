package day8;

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
		System.out.print("Even number are : ");
		for (int ele : even) {
			sum1=sum1+ele;
			System.out.print(ele + " ");
		}
		System.out.println();
		System.out.println("sum of all even number is " + sum1);
		System.out.println("Total number of even number is "+even.size());
		
		System.out.print("Odd number are : ");
		for (int ele : odd) {
			sum2=sum2+ele;
			System.out.print(ele + " ");
		}
		System.out.println();
		System.out.println("sum of all even number is " + sum2);
		System.out.println("Total number of even number is "+odd.size());
	}
}
