package ProgramsOf_19_07_2024;

public class ReverseStringButSpaceShouldBeInSamePosition {

	public static void main(String[] args) {

		String s = "i love india";

		String s1 = s.replaceAll(" ", "");
		int n = s1.length() - 1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.print(' ');
			} else {
				System.out.print(s1.charAt(n));
				n--;
			}
		}
	}

}
