package c_more_basics;

import java.util.Scanner;

public class SumOrProduct {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		int choice = s.nextInt();
		
		if(choice == 1) System.out.println(findSum(num));
		else if(choice == 2) System.out.println(findProduct(num));
		else System.out.println(-1);
		
		s.close();
	}

	private static long findProduct(int num) {
		int pdt = 1;
		while(num >= 2) {
			pdt *= num--;
		}
		return pdt;
	}

	private static int findSum(int num) {
		int sum = 0;
		while(num > 0) {
			sum += num--;
		}
		return sum;
	}
}
