package day10;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class R3_RemoveDuplicateStringUsingSet {
	public static void main(String[] args) {
		String str = "I am Sandip SanDip";
		str=makeLowerCase(str);
		System.out.println(str);
		removeDplicateString(str);
	}

	public static void removeDplicateString(String str) {
		String[] arr = str.split(" ");
		Set<String> mySet = new LinkedHashSet<String>();
		for (String ele : arr) {
			mySet.add(ele);
		}

		Iterator<String> itr = mySet.iterator();
		while (itr.hasNext()) {
			String ch = itr.next();
			System.out.print(ch+" ");
		}
		System.out.println("\n" + mySet);
	}

	public static String makeLowerCase(String str) {
		String result="";
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char) (ch + 32);
			}
			result=result+ch;
		}
		return result;
	}
}

//i am sandip sandip
//i am sandip 
//[i, am, sandip]
