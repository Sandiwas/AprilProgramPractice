package day8;

public class C9AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";

		String upperCase = "";
		String lowerCase = "";
		String numbers = "";
		String symbol = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperCase += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCase += ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else {
				symbol += ch;
			}
		}
		System.out.println("UpperCase " + upperCase);
		System.out.println("LowerCase " + lowerCase);
		System.out.println("Number " + numbers);
		System.out.println("symbol " + symbol+"\n");

		System.out.println("Acending order UpperCase " + sortAcendingOrder(upperCase));
		System.out.println("Acending order LowerCase " + sortAcendingOrder(lowerCase));
		System.out.println("Acending order Number " + sortAcendingOrder(numbers));
		System.out.println("Acending order symbol " + sortAcendingOrder(symbol)+"\n");
		
		System.out.println("Acending order UpperCase " + sortDecendingOrder(upperCase));
		System.out.println("Acending order LowerCase " + sortDecendingOrder(lowerCase));
		System.out.println("Acending order Number " + sortDecendingOrder(numbers));
		System.out.println("Acending order symbol " + sortDecendingOrder(symbol));
	}

	public static String sortAcendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		String result = "";
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}

		for (char ch : arr) {
			result = result + ch;
		}
		return result;
	}
	
	public static String sortDecendingOrder(String str) {
		str=sortAcendingOrder(str);
		String result = "";
		for(int i=str.length()-1;i>=0;i--) {
			result=result+str.charAt(i);
		}
		return result;
	}
}
