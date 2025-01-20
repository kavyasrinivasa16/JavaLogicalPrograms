package javaLogicalPrograms;

public class LargestAndSmallest {
	public static void main(String[] args) {
		// Input array
		int[] numbers = { 1, 3, 5, 6, 2, 7 };

		// Check if the array is empty
		if (numbers.length == 0) {
			System.out.println("The array is empty.");
			return;
		}

		// Initialize the largest and smallest variables
		int largest = numbers[0];
		int smallest = numbers[0];

		// Loop through the array to find the largest and smallest numbers
		for (int i = 1; i < numbers.length; i++) {
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
		}

		// Print the largest and smallest numbers
		System.out.println("Largest: " + largest);
		System.out.println("Smallest: " + smallest);
	}
}
