package day5;

public class A4_RemoveWhileSpaces1 {
public static void main(String[] args) {
	String str="s a n d i p   ";
	str=str.replaceAll("\\s","");
	System.out.println(str);
}
}
