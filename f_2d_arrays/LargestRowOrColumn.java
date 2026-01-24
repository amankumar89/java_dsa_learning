package f_2d_arrays;

public class LargestRowOrColumn {

	public static void print(int[][] arr) {
		int rowSum = Integer.MIN_VALUE;
		int rowIndex =  -1;
		for (int i = 0; i < arr.length; i++) {
			int sum = 0;
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			
			if(sum > rowSum) {
				rowSum = sum;
				rowIndex = i;
			}
		}
		
		int colSum = Integer.MIN_VALUE;
		int colIndex =  -1;
		for (int i = 0; i < arr[0].length; i++) {
			int sum = 0;
			for (int j = 0; j < arr.length; j++) {
				sum += arr[j][i];
			}
			
			if(sum > colSum) {
				colSum = sum;
				colIndex = i;
			}
		}
		
		if(rowSum > colSum) {
			System.out.println("Row " +rowIndex +", Sum " +rowSum);
		} else System.out.println("Col " +colIndex +", Sum " +colSum);
	}
}
