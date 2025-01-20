package ArrayPrgms;

import java.util.Arrays;

public class AlternateMergeWithFirstArrayReverse {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };
		// output {4, 5, 3, 6, 2, 7, 1, 8}
		int[] result = new int[a.length + b.length];

		int j = a.length - 1;
		int k = 0;

		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0 && j >= 0) {
				result[i] = a[j--];
			} else if (k < b.length) {
				result[i] = b[k++];
			} else {
				result[i] = a[j++];
			}
		}

		System.out.println(Arrays.toString(result));

	}

}
