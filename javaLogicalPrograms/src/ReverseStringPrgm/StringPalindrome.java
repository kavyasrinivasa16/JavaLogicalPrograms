package ReverseStringPrgm;

public class StringPalindrome {

	public static void main(String[] args) {
		String s = "MOM";
		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println(s + " is string palindrome");
		} else {
			System.out.println(s + " is not string palindrome");
		}

	}

}
