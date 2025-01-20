package ArrayPrgms;

import java.util.Arrays;

public class AlternateMergeWithBothArrayReverse {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };
		// output {4, 8, 3, 7, 2, 6, 1, 5}
		int[] result = new int[a.length + b.length];

		int j = a.length - 1;
		int k = b.length - 1;

		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0 && j >= 0) {
				result[i] = a[j--];
			} else if (k >= 0) {
				result[i] = b[k--];
			} else {
				result[i] = a[j--];
			}
		}

		System.out.println(Arrays.toString(result));

	}

}
