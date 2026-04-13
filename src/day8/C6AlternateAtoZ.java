package day8;

public class C6AlternateAtoZ {
public static void main(String[] args) {
	for(char ch='A';ch<='Z';ch+=1) {
		System.out.print(ch+":"+(int)ch+" ");
	}
}
}
