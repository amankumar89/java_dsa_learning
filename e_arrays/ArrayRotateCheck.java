package e_arrays;

public class ArrayRotateCheck {

	// array sorted in ascending order
	public static int checkAsc(int[] arr) {
		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i] > arr[i + 1]) {
				return i + 1;
			}
			i++;
		}
		return i;
	}

	// array sorted in descending order
	public static int checkDesc(int[] arr) {
		int i = 0;
		while (i < arr.length - 1) {
			if (arr[i] < arr[i + 1]) {
				return i + 1;
			}
			i++;
		}
		return i;
	}

	public static int rotationCountAsc(int[] arr) {
		int count = 0;
		int index = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				count++;
				index = i + 1;
			}
		}

		if (count == 0)
			return 0; // already sorted
		if (count == 1)
			return index; // rotated
		return -1; // not a rotated sorted array
	}

	public static int rotationCountDesc(int[] arr) {
		int count = 0;
		int index = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				count++;
				index = i + 1;
			}
		}

		if (count == 0)
			return 0;
		if (count == 1)
			return index;
		return -1;
	}

}
