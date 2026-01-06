package a_java_basics;

import java.util.Scanner;

public class AverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char ch = sc.next().charAt(0);
		int firstMarks = sc.nextInt();
		int secondMarks = sc.nextInt();
		int thirdMarks = sc.nextInt();
		
		System.out.println(ch +"\n" + (firstMarks + secondMarks + thirdMarks) / 3);
		
		sc.close();
	}
}
