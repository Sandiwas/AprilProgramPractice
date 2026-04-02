package methodWay;

public class P2PalindromeString {
	public static void main(String[] args){
		
	    String str="Radar";
		str=removeSpaceMakeLowerCase(str);
       System.out.println(isPalindrome(str));
	}
	
	
	public static String removeSpaceMakeLowerCase(String str){
		char[] arr=str.toCharArray();
		String result="";
		for(int i=0;i<arr.length;i++){
			if(arr[i] != ' '){
				result+=arr[i];
			}
		}
		return result.toLowerCase();
	}
	
	public static String reverseString(String str){
	String result="";
	for(int i=str.length()-1;i>=0;i--){
		result=result+str.charAt(i);
	}
	return result;
	}
	
public static String isPalindrome(String str){
	if(str.equals(reverseString(str))){
		return "Given string is plaindrome";
	}else{
		return "Given string not is plaindrome";
	}
  }
}
