package day11;

public class C9AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";
		String lowerCase = "";
		String upperCase = "";
		String numbers = "";
		String symbol = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				lowerCase += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				upperCase += ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else {
				symbol += ch;
			}
		}

		System.out.println(lowerCase);
		System.out.println(upperCase);
		System.out.println(numbers);
		System.out.println(symbol);

		System.out.println();

		System.out.println("Acending order lowerCase Character : " + acendingOrder(lowerCase));
		System.out.println("Acending order upperCase Character : " + acendingOrder(upperCase));
		System.out.println("Acending order number : " + acendingOrder(numbers));
		System.out.println("Acending order symbol : " + acendingOrder(symbol));

		System.out.println();

		System.out.println("Acending order lowerCase Character : " + decendingOrder(lowerCase));
		System.out.println("Acending order upperCase Character : " + decendingOrder(upperCase));
		System.out.println("Acending order number : " + decendingOrder(numbers));
		System.out.println("Acending order symbol : " + decendingOrder(symbol));

		System.out.println();

		System.out.println(acendingOrder(str));
		System.out.println(decendingOrder(str));
	}

	public static String acendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		String result = "";
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char ch = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = ch;
				}
			}
		}

		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}

	public static String decendingOrder(String str) {
		String str1 = acendingOrder(str);
		String finalresult = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			finalresult = finalresult + str1.charAt(i);
		}
		return finalresult;
	}
}
