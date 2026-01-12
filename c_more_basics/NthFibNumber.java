package c_more_basics;

import java.util.Scanner;

public class NthFibNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num == 1) {
			System.out.println(1);
			sc.close();
			return;
		}
		
		int a = 0;
		int b = 1;
		int c = a + b;
		
		for (int i = 3; i <= num; i++) {
			a = b;
			b = c;
			c = a + b;
		}
		
		System.out.println(c);
		
		sc.close();
	}
}
