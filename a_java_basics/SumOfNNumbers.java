package a_java_basics;

import java.util.Scanner;

public class SumOfNNumbers {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		
		int sum = 0;
		
		while(n >= 0) {
			sum += n;
			n--;
		}
		
		System.out.println(sum);
		
		s.close();
	}
}
