package day1;

public class S4RemoveDuplcateWordInSentenceUsingFor {
	public static void main(String[] args) {
		String str = "Sandip gahudas GAHUDAS wasekar Sandip wasekar";
		String[] arr = str.split(" ");
		String result = "";
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("0")) {
				continue;
			}
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[i].equalsIgnoreCase(arr[j])) {
					arr[j] = "0";
				}
			}
			if (!arr[i].equals("0")) {
				result = result + arr[i] + " ";
			}

		}
		System.out.println(result);
	}
}
//Sandip gahudas wasekar 