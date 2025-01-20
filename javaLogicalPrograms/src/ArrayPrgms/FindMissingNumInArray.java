package ArrayPrgms;

public class FindMissingNumInArray {

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5, 7, 8, 9 };
		// output= 6
		int n = a.length + 1;
		int sum1 = (n * (n + 1)) / 2;
		int sum2 = 0;

		for (int i = 0; i < a.length; i++) {
			sum2 += a[i];
		}

		System.out.println(sum1 - sum2);
	}

}
