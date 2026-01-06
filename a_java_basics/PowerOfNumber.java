package a_java_basics;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();
		int power = sc.nextInt();
		
		if(power == 0) {
			System.out.println(1);
			sc.close();
			return;
		}
		
		int ans = 1;
		while(power >= 1) {
			ans *= number;
			power--;
		}
		
		System.out.println(ans);
		
		sc.close();
	}
}
