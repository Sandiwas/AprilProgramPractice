package day13;

public class R7_SwapStringWithUsingThiredVar {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";
		swap(s1, s2);
	}

	public static void swap(String s1, String s2) {
		String s3;
		s3 = s1;
		s1 = s2;
		s2 = s3;
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
	}
}
