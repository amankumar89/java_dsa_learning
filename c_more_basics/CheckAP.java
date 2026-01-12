package c_more_basics;

import java.util.Scanner;

public class CheckAP {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num <= 2) {
			System.out.println("true");
			sc.close();
			return;
		}
		
		int prevNum = sc.nextInt();
		int nextNum = sc.nextInt();
		
		int prevDiff = nextNum - prevNum;
		
		int count = 2;
		while(count < num) {
			prevNum = nextNum;
			nextNum = sc.nextInt();
			count++;
			if((nextNum - prevNum) != prevDiff) {
				System.out.println("false");
				sc.close();
				return;
			}
		}
		System.out.println("true");
		
		sc.close();
	}
}
