package day5;

public class A6_ExtractString {
	public static void main(String[] args) {

		String str = "www.erostrom.com";

		String firstFour = str.substring(0, 4);
		String lastFour = str.substring(str.length() - 4, str.length());
		String websiteName=str.substring(4,str.length()-4);
		
		System.out.println(firstFour);
		System.out.println(lastFour);
		System.out.println(websiteName);
	}
}
