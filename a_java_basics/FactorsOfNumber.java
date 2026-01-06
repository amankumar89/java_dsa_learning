package a_java_basics;

import java.util.Scanner;

public class FactorsOfNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		
		for (int i = 2; i < number; i++) {
			if(number % i == 0) System.out.print(i +" ");
		}
		
		s.close();
	}
}
