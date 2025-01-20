package ArrayPrgms;

import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4 };
		int[] b = { 4, 5, 6, 7, 8, 7 };
		int size = Math.max(a.length, b.length);
		int[] sum = new int[size];

		for (int i = 0; i < sum.length; i++) {
			if (i < a.length) {
				sum[i] += a[i];
			}
			if (i < b.length) {
				sum[i] += b[i];
			}
		}

		System.out.println(Arrays.toString(sum));
	}

}
