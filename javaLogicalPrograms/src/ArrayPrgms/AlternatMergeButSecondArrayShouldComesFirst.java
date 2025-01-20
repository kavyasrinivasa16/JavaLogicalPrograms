package ArrayPrgms;

import java.util.Arrays;

public class AlternatMergeButSecondArrayShouldComesFirst {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };
		// output {5,1,6,2,7,3,8,4}
		int[] result = new int[a.length + b.length];

		int j = 0;
		int k = 0;

		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 1 && j < a.length) {
				result[i] = a[j++];
			} else if (k < b.length) {
				result[i] = b[k++];
			} else {
				result[i] = a[j++];
			}
		}

		System.out.println(Arrays.toString(result));

	}

}
