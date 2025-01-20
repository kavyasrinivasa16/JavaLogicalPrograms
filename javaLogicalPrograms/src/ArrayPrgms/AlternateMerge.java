package ArrayPrgms;

import java.util.Arrays;

public class AlternateMerge {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 5, 6, 7, 8 };
		// output {1, 5, 2, 6, 3, 7, 4, 8}
		int[] result = new int[a.length + b.length];

		int j = 0;
		int k = 0;

		for (int i = 0; i < result.length; i++) {
			if (i % 2 == 0 && j < a.length) {
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
