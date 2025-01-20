package PatternsProgram;

public class BoxWith5rowsAnd5Columns {

	public static void main(String[] args) {
		// printing rows, print lines
		for (int i = 1; i <= 5; i++) {

			// printing coloumns, print *

			for (int j = 1; j <= 5; j++) {
				System.out.print(j + " ");
			}
			System.out.println();

		}

	}
}
