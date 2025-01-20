package ArrayPrgms;

public class ShiftZeroesToLeftSide {

	public static void main(String[] args) {

		int[] a = { 2, 1, 0, 5, 8, 0, 5, 0, 6 };
		// 0,0,0,2,1,5,8,5,6
		int[] result = new int[a.length];
		int index = a.length - 1;

		for (int i = a.length - 1; i >= 0; i--) {
			if (a[i] != 0) {
				result[index--] = a[i];
			}
		}
		for (int i : result) {
			System.out.print(i + " ");
		}
	}

}
