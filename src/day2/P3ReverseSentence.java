package day2;

public class P3ReverseSentence {
	public static void main(String[] args) {
		String str = "Automation is fun";
		System.out.println(reverseSentence(str));
	}

	public static String reverseSentence(String str) {
		String[] arr = str.split(" ");
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			result = result + arr[i] + " ";
		}
		return result;
	}
}
