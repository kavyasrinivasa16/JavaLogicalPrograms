package ReverseStringPrgm;

public class ReverseStringByRecursion {

	public static void main(String[] args) {
		reverse("Kavya");
	}

	public static void reverse(String s) {
		if (s.length() >= 1) {
			System.out.print(s.charAt(s.length() - 1));
			reverse(s.substring(0, s.length() - 1));

		}

	}
}
