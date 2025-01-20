package javaLogicalPrograms;

public class CountLetters {
	public static void main(String[] args) {
		// Input string
		String input = "I am a traVeLLer";

		// Variables to hold the count of uppercase and lowercase letters
		int uppercaseCount = 0;
		int lowercaseCount = 0;

		// Loop through each character in the input string
		for (int i = 0; i < input.length(); i++) {
			char currentChar = input.charAt(i);

			// Check if the character is an uppercase letter
			if (Character.isUpperCase(currentChar)) {
				uppercaseCount++;
			}
			// Check if the character is a lowercase letter
			else if (Character.isLowerCase(currentChar)) {
				lowercaseCount++;
			}
		}

		// Print the counts
		System.out.println("Uppercase: " + uppercaseCount);
		System.out.println("Lowercase: " + lowercaseCount);
	}
}
