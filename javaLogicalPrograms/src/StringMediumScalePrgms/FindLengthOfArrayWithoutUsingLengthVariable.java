package StringMediumScalePrgms;

public class FindLengthOfArrayWithoutUsingLengthVariable {

	public static void main(String[] args) {

		int arr[] = { 1, 4, 6, 7, 8, 9 };
		int count = 0;
		for (int a : arr) {
			count++;
		}
		System.out.println(count);
	}

}
