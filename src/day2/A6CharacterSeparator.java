package day2;

public class A6CharacterSeparator {
	public static void main(String[] args) {
		String str = "SDFA3jdjdn3765678#$%^#";

		String UpperCaseletters = "";
		String LowerCaseletters = "";
		String numbers = "";
		String symboles = "";

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch >= 'A' && ch <= 'Z') {
				UpperCaseletters += ch;
			} else if (ch >= 'a' && ch <= 'z') {
				LowerCaseletters += ch;
			} else if (ch >= '0' && ch <= '9') {
				numbers += ch;
			} else {
				symboles += ch;
			}
		}
		System.out.println("UpperCase letter : " + UpperCaseletters);
		System.out.println("LowerCase letter :  " + LowerCaseletters);
		System.out.println("Numbers  : " + numbers);
		System.out.println("Symboles : " + symboles+"\n");

		System.out.println("UpperCase letter : " + sortAcendingOrder(UpperCaseletters));
		System.out.println("LowerCase letter :  " + sortAcendingOrder(LowerCaseletters));
		System.out.println("Numbers  : " + sortAcendingOrder(numbers));
		System.out.println("Symboles : " + sortAcendingOrder(symboles)+"\n");

		System.out.println("UpperCase letter : " + sortDecendingOrder(UpperCaseletters));
		System.out.println("LowerCase letter :  " + sortDecendingOrder(LowerCaseletters));
		System.out.println("Numbers  : " + sortDecendingOrder(numbers));
		System.out.println("Symboles : " + sortDecendingOrder(symboles)+"\n");
	}

	public static String sortAcendingOrder(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
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
		char[] arr = str.toCharArray();
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] < arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j+1] = temp;
				}
			}
		}
		String result = "";
		for (int i = 0; i < arr.length; i++) {
			result = result + arr[i];
		}
		return result;
	}

}
