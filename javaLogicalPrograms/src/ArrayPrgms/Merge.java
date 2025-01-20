package ArrayPrgms;

import java.util.Arrays;

public class Merge {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };
		// output {1,2,3,4,5,6,7,8}
		int[] result = new int[a.length + b.length];

		int j = 0; // j is used to maintain the index of array a
		int k = 0; // k is used to maintain the index of array b

		// looping over resultant array
		for (int i = 0; i < result.length; i++) {
			if (j < a.length) {
				result[i] = a[j++];
			} else if (k < b.length) {
				result[i] = b[k++];
			}
		}

		System.out.println(Arrays.toString(result));
	}

}
