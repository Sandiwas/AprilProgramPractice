package day10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class R5_RemoveDuplicateStringUsingSet {
	public static void main(String[] args) {
		String[] arr = { "Java", "rUby", "Js", "javA", "ruby", "js", "js" };
		arr = makeLowerCaseArrayString(arr);
		removeDuplicateWord(arr);
	}

	public static void removeDuplicateWord(String[] arr) {
		
		Set<String> mySet = new LinkedHashSet<String>();
		
		for (String ele : arr) {
			mySet.add(ele);
		}
		
		Iterator<String> itr = mySet.iterator();
		while (itr.hasNext()) {
			System.out.print(itr.next()+" ");
		}
		System.out.println("\n" + mySet);

	}

	public static String[] makeLowerCaseArrayString(String[] arr) {
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
