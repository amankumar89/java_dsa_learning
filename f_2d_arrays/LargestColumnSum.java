package f_2d_arrays;

public class LargestColumnSum {

	public static int largestColumnSum(int[][] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr[0].length; i++) {
			int columnSum = 0;
			for (int j = 0; j < arr.length; j++) {
				columnSum += arr[j][i];
			}
			if(columnSum > max) max = columnSum;
		}
		
		return max;
	}
}
