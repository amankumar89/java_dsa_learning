package e_arrays;

public class SecondLargest {

	public static int max(int[] arr) {
		int secMax = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				secMax = max;
				max = arr[i];
			}else if(arr[i] > secMax && arr[i] != max){
				secMax = arr[i];
			}
		}
		
		return secMax;
	}
}
