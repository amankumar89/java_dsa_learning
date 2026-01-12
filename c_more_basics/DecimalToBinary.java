package c_more_basics;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		long num = s.nextLong();
		
		System.out.println(decimalToBinary(num));
		
		s.close();
	}

	private static long decimalToBinary(long num) {
		long ans = 0;
		int i = 1;
		
		while(num > 0) {
			long rem = num % 2;
			ans += rem * i;
			num /= 2;
			i *= 10;
		}
		return ans;
	}
}
