package Practice;

public class PrintUpperLowerAlphabets {

	public static void main(String[] args) {

		for (char ch = 'A'; ch <= 'Z'; ch++) {
			System.out.println(ch + " " + (char) (ch + 32));
		}

	}

}
