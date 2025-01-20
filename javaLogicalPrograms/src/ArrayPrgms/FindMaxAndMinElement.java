package ArrayPrgms;

public class FindMaxAndMinElement {

	public static void main(String[] args) {
		int[] arr = { 10, 20, -10, 40, 90 };
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("maximum element is = " + max);
		System.out.println("minimum element is = " + min);

	}

}
