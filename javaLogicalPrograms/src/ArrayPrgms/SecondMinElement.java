package ArrayPrgms;

public class SecondMinElement {

	public static void main(String[] args) {
		int[] a = { 12, 34, 76, 96, 47, 98, 63, 99};
		int min = Integer.MAX_VALUE;
		int sec_min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) {
			if (min > a[i]) {
				sec_min = min;
				min = a[i];
			} else if (sec_min > a[i] && min!=a[i]) {
				sec_min = a[i];
			}
		}
		System.out.println(sec_min);

	}

}
