package ArrayPrgms;

import java.util.Arrays;

public class FirstArrayReverse {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };
		// output {4,3,2,1,5,6,7,8}
		int[] result = new int[a.length + b.length];

		int j = a.length - 1; // j is used to maintain the index of array a
		int k = 0; // k is used to maintain the index of array b

		// looping over resultant array
		for (int i = 0; i < result.length; i++) {
			if (j >= 0) {
				result[i] = a[j--];
			} else if (k < b.length) {
				result[i] = b[k++];
			}
		}

		System.out.println(Arrays.toString(result));

	}

}
