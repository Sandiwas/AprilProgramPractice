package day8;

public class S2RemoveDuplicateCharUsingFor {
	public static void main(String[] args) {
		String str = "sandip gahudas wasekaR";
		str=removeSpaceMakeLowerCase(str);
		removeDuplicateChar(str);
	}

	public static void removeDuplicateChar(String str) {
		char[] arr=str.toCharArray();
		String result="";
		for(int i=0;i<arr.length;i++) {
			if(arr[i] == '0') {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					arr[j]='0';
				}
			}
			if(arr[i] != '0') {
				result=result+arr[i];
			}
		}
		System.out.println(result);
	}
	public static String removeSpaceMakeLowerCase(String str) {
		char[] arr = str.toCharArray();
		String result = "";
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != ' ') {
				result=result+arr[i];
			}
		}
		return result.toLowerCase();
	}
}
