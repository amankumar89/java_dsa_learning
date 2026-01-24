package f_2d_arrays;

public class TransposeMatrix {

	public static int[][] transpose(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		int[][] transpose = new int[rows][cols];
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				transpose[j][i] = arr[i][j];
			}
		}
		
		return transpose;
	}
}
