package ReverseStringPrgm;

public class ReverseWithoutLengthFunctionOrVariable {

	public static void main(String[] args) {

		String input = "India";
		String output = "";

		for (char ch : input.toCharArray()) {
			output = ch + output;
		}
		System.out.println(output);

	}

}
