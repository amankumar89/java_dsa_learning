package c_more_basics;

import java.util.Scanner;

public class BinaryToDecimal {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		System.out.println(binaryToDecimal(num));
		
		s.close();
	}

	private static int binaryToDecimal(int num) {
		int ans = 0;
		int n = 0;
		while(num > 0) {
			int ld = num % 10;
			ans += ld * Math.pow(2, n++);
			num /= 10;
		}
		return ans;
	}
}
