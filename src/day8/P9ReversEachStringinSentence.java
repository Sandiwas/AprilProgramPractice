package day8;

public class P9ReversEachStringinSentence {
	public static void main(String[] args) {
		String str = "Automation is fun";
		System.out.println(reverseStringInSentence(str));
	}

	public static String reverseStringInSentence(String str) {
		String[] arr = str.split(" ");
		String result="";
		for(int i=0;i<arr.length;i++) {
			String word=arr[i];
			String reverseString="";
			for(int j=word.length()-1;j>=0;j--) {
				reverseString=reverseString+word.charAt(j);
			}
			result=result+reverseString+" ";
		}
		return result;
	}
}
