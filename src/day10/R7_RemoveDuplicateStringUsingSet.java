package day10;


import java.util.LinkedHashSet;
import java.util.Set;

public class R7_RemoveDuplicateStringUsingSet {

	public static void main(String[] args) {
		String[] arr = { "java", "Ruby", "JS", "java", "ruBY", "js", "jS" };
		arr = makeLowerCase(arr);
		removeDuplicate(arr);
	}

	public static void removeDuplicate(String[] arr) {
		Set<String> mySet = new LinkedHashSet<String>();
		for (String ele : arr) {
			mySet.add(ele);
		}
		System.out.println(mySet);
	}

	public static String[] makeLowerCase(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			String result = "";
			for (int j = 0; j < arr[i].length(); j++) {
				char ch = arr[i].charAt(j);
				if (ch >= 'A' && ch <= 'Z') {
					ch = (char) (ch + 32);
				}
				result = result + ch;
			}
			arr[i] = result;
		}
		return arr;
	}

}
