package PRACTICE_25_06_2024;

public class ReverseString {

	public static void main(String[] args) {
		// 1.Write a program to reverse a string. Ex: input: Hello output:olleH
		String input = "Hello";
		String rev = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			rev = rev + input.charAt(i);
		}
		System.out.println(rev);
	}

}
