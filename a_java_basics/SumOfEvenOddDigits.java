package a_java_basics;

import java.util.Scanner;

public class SumOfEvenOddDigits {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int number = s.nextInt();
		
		int evenDigitSum = 0;
		int oddDigitSum = 0;
		
		while(number > 0) {
			int lastDigit = number % 10;
			if(lastDigit % 2 == 0) evenDigitSum += lastDigit;
			else oddDigitSum += lastDigit;
			number /= 10;
		}
		
		System.out.println(evenDigitSum +"," +oddDigitSum);
		
		s.close();
	}
}
