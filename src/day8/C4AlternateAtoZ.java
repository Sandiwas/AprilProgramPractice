package day8;

public class C4AlternateAtoZ {
public static void main(String[] args) {
	for(char ch='a';ch<='z';ch+=1) {
		System.out.print(ch+":"+(int)ch+" ");
	}
}
}
