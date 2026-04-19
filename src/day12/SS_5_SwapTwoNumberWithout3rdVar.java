package day12;

public class SS_5_SwapTwoNumberWithout3rdVar {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		swap(x, y);
	}
	public static void swap(int x, int y) {

		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
