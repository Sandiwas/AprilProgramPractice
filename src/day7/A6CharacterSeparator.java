package day7;

public class A6CharacterSeparator {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";

		String upperCaseletters = "";
		String lowerCaseletters = "";
		String numbers = "";
		String symboles = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				upperCaseletters += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				lowerCaseletters += ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else {
				symboles += ch;
			}
		}

		System.out.println("UpperCase letter : " + upperCaseletters);
		System.out.println("LowerCase letter :  " + lowerCaseletters);
		System.out.println("Numbers  : " + numbers);
		System.out.println("Symboles : " + symboles + "\n");

		System.out.println("Acending upperCase letter : " + sortAcendingOrder(upperCaseletters));
		System.out.println("Acending lowerCase letter :  " + sortAcendingOrder(lowerCaseletters));
		System.out.println("Acending numbers  : " + sortAcendingOrder(numbers));
		System.out.println("Acending symboles : " + sortAcendingOrder(symboles) + "\n");
		
		System.out.println("Acending upperCase letter : " + sortDecendingOrder(upperCaseletters));
		System.out.println("Acending lowerCase letter :  " + sortDecendingOrder(lowerCaseletters));
		System.out.println("Acending numbers  : " + sortDecendingOrder(numbers));
		System.out.println("Acending symboles : " + sortDecendingOrder(symboles) + "\n");
	}

	public static String sortAcendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}

	public static String sortDecendingOrder(String str) {
		String str1 = sortAcendingOrder(str);
		String result = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			result = result + str1.charAt(i);
		}
		return result;
	}
}
