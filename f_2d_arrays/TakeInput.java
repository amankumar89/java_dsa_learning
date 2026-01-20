package f_2d_arrays;

import java.util.Scanner;

public class TakeInput {
	public static int[][] input(Scanner s) {
		int m = s.nextInt();
		int n = s.nextInt();

		int[][] arr = new int[m][n];

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = s.nextInt();
			}
		}
		return arr;
	}
}