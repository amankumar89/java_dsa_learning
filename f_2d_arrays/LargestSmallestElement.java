package f_2d_arrays;

public class LargestSmallestElement {

	public static void maxAndMin(int[][] arr) {
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < min) min = arr[i][j];
				if(arr[i][j] > max) max = arr[i][j];
			}
		}
		System.out.println("Max: " +max +"\n" +"Min: " +min);
	}
}
