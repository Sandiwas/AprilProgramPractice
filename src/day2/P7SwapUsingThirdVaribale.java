package day2;

public class P7SwapUsingThirdVaribale {
	public static void main(String[] args) {
		String str1 = "Hello";
		String str2 = "world";
		String str3;
		str3 = str1;
		str1 = str2;
		str2 = str3;
		System.out.println("str1 = " + str1);
		System.out.println("str2 = " + str2);

	}
}
