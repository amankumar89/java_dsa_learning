package a_java_basics;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}
		
		s.close();
	}
}
