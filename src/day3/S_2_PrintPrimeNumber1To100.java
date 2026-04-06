package day3;

public class S_2_PrintPrimeNumber1To100 {
	public static void main(String[] args) {
		int n = 100;
		int s;
		for (int i = 2; i < n; i++) {
			s = 0;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					s = 1;
					break;
				}
			}
			if(s==0) {
				System.out.print(i+" ");
			}
		}
	}
}//2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 