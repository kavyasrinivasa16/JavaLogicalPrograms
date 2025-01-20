package ReverseStringPrgm;

public class Recurssion {

	static void reverse(String s, int a) {
		if (a >= 0) {
			System.out.print(s.charAt(a));
			reverse(s, a - 1);
		}
	}

	public static void main(String[] args) {

		String s = "kavya";
		int a = s.length() - 1;
		reverse(s, a);
	}

}
