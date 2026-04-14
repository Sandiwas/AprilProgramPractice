package day9;

public class SS_5_SwapTwoNumberWithout3rdVar {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;

		x = x + y;
		y = x - y;
		x = x - y;

		System.out.println("x = " + x);
		System.out.println("y = " + y);

	}
}
