package ArrayPrgms;

import java.util.Arrays;

public class AlternateMergeWithSecondArrayReverse {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };
		// output {1,8,2,7,3,6,4,5}
		int[] result = new int[a.length + b.length];

		int j = 0;
		int k = b.length - 1;

		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0 && j < a.length) {
				result[i] = a[j++];
			} else if (k >= 0) {
				result[i] = b[k--];
			} else {
				result[i] = a[j++];
			}
		}

		System.out.println(Arrays.toString(result));

	}

}
