package c_more_basics;

import java.util.Scanner;

public class TermsOfAp {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
//		3n + 2
		
		int j = 1;
		int i = 1;
		while(j <= num) {
			if(((3 * i) + 2) % 4 != 0) {
				System.out.println((3 * i) + 2);
				i++;
				j++;
			} else i++;
		}
		
		s.close();
	}
}
