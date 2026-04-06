package day3;

public class S_12_ArmstrongNumber {

	public static void main(String[] args) {
		int a;
		int n = 407;
		int c = 0;
		int temp = n;
		while (n > 0) {
			a = n % 10;
			n = n / 10;
			c = c + (a * a * a);
		}
		if (temp == c) {
			System.out.println(temp + " is Armstring number");
		} else {
			System.out.println(temp + " is not Armstring number");
		}

	}

}
//
//1634
//8208
//9474
//1 2 3 4 5 6 7 8 9 153 370 371 407

//o/p : 407 is Armstring number