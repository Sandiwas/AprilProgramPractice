package day7;

public class A3AscendingAndDescendingString {
	public static void main(String[] args) {
		String str = "ajdhfuwykdADFNDJ";

		char[] arr = sortArray(str);
		System.out.println(arr);
		
		String acending="";
		String deceding="";
		
		for(int i=0;i<arr.length;i++) {
			acending=acending+arr[i];
		}
		System.out.println(acending);
		
		for(int i=arr.length-1;i>=0;i--) {
			deceding=deceding+arr[i];
		}
		System.out.print(deceding+" ");
		
	}

	public static char[] sortArray(String str) {
		char[] arr = str.toCharArray();
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					char temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		return arr;
	}
}
