package day4;

public class S2FindDuplicateStringInSentence {
	public static void main(String[] args) {
		String str = "I am learning learning java java";
		String[] arr = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i].equals("0")) {
				continue;
			}
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					count++;
					arr[j] = "0";
				}
			}
			if (count > 1 && !arr[i].equals("0")) {
				System.out.println(arr[i] + " = " + count);
			}
		}
	}
}
