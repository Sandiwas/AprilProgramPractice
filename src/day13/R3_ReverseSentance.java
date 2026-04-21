package day13;

public class R3_ReverseSentance {
	public static void main(String[] args) {
		String str = "Automation is fun";
		System.out.println(reverseSentenec(str));

	}

	public static String reverseSentenec(String str) {
		String[] arr = str.split(" ");
		String result = "";
		for (int i = arr.length-1; i >= 0; i--) {
			result = result + arr[i] + " ";
		}
		return result;
	}
}
