package javaLogicalPrograms;

public class AddNumInString {

	    public static void main(String[] args) {
	        // Input string
	        String input = "asc123bsd4";
	        
	        // Variable to hold the sum of numbers
	        int sum = 0;
	        
	        // Variable to store the current number as a string
	        String currentNumber = "";
	        
	        // Loop through each character in the input string
	        for (int i = 0; i < input.length(); i++) {
	            char currentChar = input.charAt(i);
	            
	            // Check if the current character is a digit
	            if (Character.isDigit(currentChar)) {
	                currentNumber += currentChar; // Append the digit to currentNumber
	            } else {
	                // If currentNumber is not empty, convert it to an integer and add to sum
	                if (!currentNumber.isEmpty()) {
	                    sum += Integer.parseInt(currentNumber);
	                    currentNumber = ""; // Reset currentNumber
	                }
	            }
	        }
	        
	        // Add the last number if currentNumber is not empty
	        if (!currentNumber.isEmpty()) {
	            sum += Integer.parseInt(currentNumber);
	        }
	        
	        // Print the result
	        System.out.println("Sum = " + sum);
	    }
	}