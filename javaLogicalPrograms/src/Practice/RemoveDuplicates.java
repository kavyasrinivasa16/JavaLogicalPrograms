package Practice;

public class RemoveDuplicates {
	public static void main(String[] args) {
		String input = "kavya";
		String output = "";

		for (int i = 0; i <= input.length()-1; i++) {
			char currentChar = input.charAt(i);
			if (output.indexOf(currentChar) == -1) {
				output = output + currentChar;
			}
		}
		System.out.println(output);
	}
}