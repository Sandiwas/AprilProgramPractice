package day12;

public class SS_4_SwapTwoNumberWith3rdVar {
	public static void main(String[] args) {
		int x = 100;
		int y = 200;
		swap(x, y);
	}

	public static void swap(int x, int y) {
		int z;
		z = x;
		x = y;
		y = z;
		System.out.println("x = " + x);
		System.out.println("x = " + y);
	}
}
