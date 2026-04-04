package day2;

public class S6AlternateAtoZ {
public static void main(String[] args) {
	for(char ch='A';ch<='Z';ch+=2) {
		System.out.println(ch+" = "+(int)ch);
	}
}
}
