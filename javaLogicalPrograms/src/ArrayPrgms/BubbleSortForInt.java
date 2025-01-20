package ArrayPrgms;

import java.util.Arrays;

public class BubbleSortForInt {

	public static void main(String[] args) {

		int[] a = { 12, 23, 34, 4, 3 };
		int n = a.length;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
