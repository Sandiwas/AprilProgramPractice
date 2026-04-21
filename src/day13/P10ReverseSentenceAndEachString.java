package day13;

public class P10ReverseSentenceAndEachString {

	public static void main(String[] args) {
		String str = "Automation is fun";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String str) {
		String[] arr = str.split(" ");
		String result = "";
		for (int i = arr.length-1; i >=0; i--) {
			String word = arr[i];
			String reverse = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverse = reverse + word.charAt(j);
			}
			result = result + reverse + " ";
		}
		return result;

	}

}
