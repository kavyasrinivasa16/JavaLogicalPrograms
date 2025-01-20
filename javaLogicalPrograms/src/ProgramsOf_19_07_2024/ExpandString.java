package ProgramsOf_19_07_2024;

public class ExpandString {

	public static void main(String[] args) {

		String s = "a2b2c1a1b2";
		// output = aabbcabb

		for (int i = 0; i < s.length() - 1; i = i + 2) {
			char ch = s.charAt(i);
			int count = s.charAt(i + 1) - 48;
			for (int j = 0; j < count; j++) {
				System.out.print(ch);
			}
		}

	}

}
