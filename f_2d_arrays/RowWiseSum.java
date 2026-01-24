package f_2d_arrays;

public class RowWiseSum {

	public static void sum(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rowSum += arr[i][j];
			}
			System.out.print(rowSum +" ");
		}
		System.out.println();
	}
}
