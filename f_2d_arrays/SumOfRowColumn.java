package f_2d_arrays;

public class SumOfRowColumn {

	public static void sum(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			int rowSum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				rowSum += arr[i][j];
			}
			System.out.println("Row " +i +", Sum: " +rowSum);
		}
		for (int i = 0; i < arr[0].length; i++) {
			int columnSum = 0;
			for (int j = 0; j < arr.length; j++) {
				columnSum += arr[i][j];
			}
			System.out.println("Column " +i +", Sum: " +columnSum);
		}
	}
}
