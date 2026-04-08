package day4;

public class PD7_DuplicateStringInUsingFor {
	public static void main(String[] args) {
		String[] arr = { "pune", "pune", "mumbai", "mumbai", "chennai", "chennai" };

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			if (arr[i].equals("0")) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equalsIgnoreCase(arr[j])) {
					count++;
					arr[j]="0";
				}
			}
			if(count>1 && !arr[i].equals("0")) {
				System.out.println(arr[i]+" = "+count);
			}
		}
	}
}
