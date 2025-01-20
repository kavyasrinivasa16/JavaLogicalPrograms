package javaLogicalPrograms;

public class LongestWord {
	public static void main(String[] args) {
		// Input string
		String input = "I am a student.";

		// Split the string into words based on whitespace
		String[] words = input.split("\\s+");

		// Variable to hold the longest word
		String longestWord = "";

		// Loop through each word to find the longest one
		for (String word : words) {
			// Remove any punctuation marks from the word
			String cleanedWord = word.replaceAll("[^a-zA-Z]", "");

			// Compare the current word with the longestWord found so far
			if (cleanedWord.length() > longestWord.length()) {
				longestWord = cleanedWord;
			}
		}

		// Print the longest word
		System.out.println("Longest word: " + longestWord);
	}
}
