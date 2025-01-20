package ProgramsOf_19_07_2024;

public class GenerateSubStringGreaterThan3 {

	public static void main(String[] args) {

		String s = "Kavya";

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j <= s.length(); j++) {

				if (s.substring(i, j).length() >= 3) {
					System.out.print(s.substring(i, j) + " ");
				}

			}
		}

	}

}
