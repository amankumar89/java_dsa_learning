package c_more_basics;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		int i = 1;
		int sq = i;
		while(i * i <= num) {
			sq = i;
			i = i + 1;
		}
		
		System.out.println(sq);
		
		s.close();
	}

}
