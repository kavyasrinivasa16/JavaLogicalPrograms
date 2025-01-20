package PatternsProgram;

public class T2 {

	public static void main(String[] args) {

		// printing rows, print lines
		for (int i = 1; i <= 5; i++) {

			// printing coloumns, print *

			for (int j = 1; j <= 5; j++) {
				if (i + j >= 6) {
					System.out.print("* ");
				} else 
					System.out.print("  ");
				
			}
			System.out.println();

		}

	}

}
