package javaLogicalPrograms;

public class RemoveDuplicates {

	public static void main(String[] args) {

		// Input string
		String input = "Java is a programming language";

		// Array to mark characters that have already been encountered
		boolean[] seen = new boolean[256]; // Assuming ASCII characters

		// Variable to hold the result without duplicates
		String result = "";

		// Loop through each character in the input string
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			// If the character has not been encountered before, append it to the result
			if (!seen[currentChar]) {
				result = result + currentChar;
				seen[currentChar] = true;
			}
		}

		// Print the result
		System.out.println("Output: " + result);

	}

}
