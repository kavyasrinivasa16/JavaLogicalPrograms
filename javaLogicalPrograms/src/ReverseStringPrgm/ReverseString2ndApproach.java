package ReverseStringPrgm;

public class ReverseString2ndApproach {
	public static void main(String[] args) {
		String s = "India";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);
	}
}
