package f_2d_arrays;

public class Print2DArray {

	public static void print(int[][] arr) {
		if(arr == null) return;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] +" ");
			}
			System.out.println();
		}
	}
}
