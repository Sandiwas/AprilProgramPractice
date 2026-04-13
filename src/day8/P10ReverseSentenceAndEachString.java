package day8;

public class P10ReverseSentenceAndEachString {
	public static void main(String[] args) {
		String str = "Automation is fun";
		System.out.println(reverseSentenceAndEachWord(str));
	}

	public static String reverseSentenceAndEachWord(String str) {
		String[] arr = str.split(" ");
		String result = "";
		for (int i = arr.length - 1; i >= 0; i--) {
			String word = arr[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			result = result + reverseWord + " ";
		}
		return result;
	}
}
