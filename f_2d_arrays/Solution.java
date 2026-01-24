package f_2d_arrays;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int[][] arr = TakeInput.input(s);
		
//		Print2DArray.print(arr);
		
		int ans = LargestColumnSum.largestColumnSum(arr);
		System.out.println(ans);
		s.close();
	}
}
