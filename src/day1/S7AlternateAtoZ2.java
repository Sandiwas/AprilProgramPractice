package day1;

public class S7AlternateAtoZ2 {
	public static void main(String[] args) {
		for (char ch = 'a'; ch <= 'z'; ch += 2) {
			System.out.print(ch+" ");
			System.out.print((int) ch + " ");
		}
	}
}