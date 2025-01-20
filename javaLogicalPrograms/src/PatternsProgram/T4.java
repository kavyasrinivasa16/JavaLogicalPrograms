package PatternsProgram;

public class T4 {

	public static void main(String[] args) {
		int n = 5; // Number of rows in the triangle

		for (int i = n; i >= 1; i--) {
			for (int j = n - i; j > 0; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
