package day2;


public class A1AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";
		
		System.out.println("Ascending = "+sortAscending(str));
		System.out.println("Descending = "+sortDescending(str));
		
	}
	
	public static String sortAscending(String str) {
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
		return new String(arr);
	}
	
	public static String sortDescending(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - 1 - i; j++) {
				if (arr[j] < arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return new String(arr);
	}
}

//A to Z  65 to 90
//a to z  97 to 122
//0 to 9  48 to 57

