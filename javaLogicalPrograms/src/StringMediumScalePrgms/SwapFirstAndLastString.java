package StringMediumScalePrgms;

public class SwapFirstAndLastString {

	public static void main(String[] args) {

		String s = "My name is kavya";
		String[] arr = s.split(" ");
		String temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		for (String a : arr) {
			System.out.print(a + " ");
		}

	}

}
