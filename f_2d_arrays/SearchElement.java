package f_2d_arrays;

public class SearchElement {

	public static boolean search(int[][] arr, int x) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == x) return true;
			}
		}
		return false;
	}
}
