package Practice;

public class RemoveDuplicatesFromUpperLowerCase {
	public static void main(String[] args) {
		String input = "My name is katrina";
		String output = "";

		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);
			char ch1 = Character.toLowerCase(currentChar);
			char ch2 = Character.toUpperCase(currentChar);
			if (output.indexOf(ch1) == -1 && output.indexOf(ch2) == -1) {
				output = output + currentChar;
			}
		}
		System.out.println(output);
	}
}
