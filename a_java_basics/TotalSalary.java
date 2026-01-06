package a_java_basics;

import java.util.Scanner;

public class TotalSalary {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int basicSalary = s.nextInt();
		char grade = s.next().charAt(0);
		
		double hra = 0.20 * basicSalary;
		double da = 0.50 * basicSalary;
		double pf = 0.11 * basicSalary;
	
		int allow = grade == 'A' ? 1700 : (grade == 'B' ? 1500 : 1300);
		
		System.out.println(Math.round((basicSalary + hra + da + allow) - pf));
		
		s.close();
	}
}
