package StringMediumScalePrgms;

public class CategoryProgram {

	public static void main(String[] args) {

		String s = "sd6k3y$%d48";
		String alphabet = "";
		String number = "";
		String special = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
				alphabet += ch;
			} else if (ch >= '0' && ch <= '9') {
				number += ch;
			} else {
				special += ch;
			}
		}
		System.out.println("Alphabets: " + alphabet);
		System.out.println("Numbers: " + number);
		System.out.println("SpecialCharacter: " + special);

	}

}
