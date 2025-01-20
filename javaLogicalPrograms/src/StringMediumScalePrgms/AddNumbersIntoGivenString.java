package StringMediumScalePrgms;

public class AddNumbersIntoGivenString {

	public static void main(String[] args) {

		String input = "a2b2c3d1";
		int sum = 0;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch >= '0' && ch <= '9') {
				sum = sum + ch - 48;
			}
		}
		System.out.println(sum);

	}

}
