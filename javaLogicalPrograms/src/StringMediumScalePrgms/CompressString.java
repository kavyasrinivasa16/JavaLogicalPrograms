package StringMediumScalePrgms;

public class CompressString {

	public static void main(String[] args) {

		String s = "aabbccaa"; 							// output: a2b2c2a2

		int i;
		int count = 1;
		String output = "";

		for (i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			} else {
				output = output + s.charAt(i) + count;
				count = 1;
			}
		}
		if (i == s.length() - 1) {
			output = output + s.charAt(i) + count;
		}
		System.out.println(output);
	}

}
