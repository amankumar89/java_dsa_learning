package c_more_basics;

import java.util.Scanner;

public class CheckNumberSequence {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int num = s.nextInt();
		
		int prevNum = s.nextInt();
		
		boolean isDec = true;
		int count = 2, currentNum;
		
		while(count <= num) {
			currentNum = s.nextInt();
			count++;
			
			if(currentNum == prevNum) {
				System.out.println("false");
				s.close();
				return;
			}
			if(currentNum < prevNum) {
				if(isDec == false) {
					System.out.println("false");
					s.close();
					return;
				}
			} else {
				if(isDec == true) {
					isDec = false;
				}
			}
			prevNum = currentNum;
		}
		System.out.println("true");
	
		s.close();
	}

}
