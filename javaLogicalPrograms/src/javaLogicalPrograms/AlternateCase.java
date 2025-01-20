package javaLogicalPrograms;

public class AlternateCase {
	public static void main(String[] args) {
		// Input string
		String input = "Listen";

		// Variable to hold the result with alternate cases
		String result = "";

		// Flag to determine if the next character should be uppercase
		boolean toUpperCase = true;

		// Loop through each character in the input string
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			// Check if the character is a letter
			if (Character.isLetter(currentChar)) {
				if (toUpperCase) {
					result += Character.toUpperCase(currentChar);
				} else {
					result += Character.toLowerCase(currentChar);
				}
				// Toggle the case for the next character
				toUpperCase = !toUpperCase;
			} else {
				// If the character is not a letter, add it as is
				result += currentChar;
			}
		}

		// Print the result
		System.out.println("Output: " + result);
	}
}
