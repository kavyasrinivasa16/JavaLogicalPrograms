package JavaAssignmenet;

public class LowerCaseUpperCase {

	public static void main(String[] args) {

		String s = "I am a traVeLLer";
		int count = 0, count1 = 1;
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				count++;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				count1++;
			}
		}
		System.out.println("Uppercase : " + count);
		System.out.println("Lowercase : " + count1);

	}

}
