package c_more_basics;

import java.util.Scanner;

public class PrimePrintTillN {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		printPrime(num);
		
		s.close();
	}
	
	private static void printPrime(int num) {
		for (int i = 2; i <= num; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
	
	private static boolean isPrime(int num) {
		if(num <= 1) return false;
		
		int div = 2;
		while(div <= num/2) {
			if(num % div == 0) return false;
			div++;
		}
		return true;
	}
}
