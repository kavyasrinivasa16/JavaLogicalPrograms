package Practice;

public class RemoveDuplicatesConsideringUpperLowerCase {

	public static void main(String[] args) {
		String input = "Vivek0101";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			char ch1 = '\u0000';
			char ch2 = '\u0000';
			if (currentChar >= 'a' && currentChar <= 'z') {
				ch1 = (char) (currentChar - 32);
			} else {
				ch1 = currentChar;
			}
			if (currentChar >= 'A' && currentChar <= 'Z') {
				ch2 = (char) (currentChar + 32);
			} else {
				ch2 = currentChar;
			}
			if (output.indexOf(ch1) == -1 && output.indexOf(ch2) == -1) {
				output = output + currentChar;
			}
		}
		System.out.println(output);

	}

}
