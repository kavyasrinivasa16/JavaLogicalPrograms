package StringProgram;

import java.util.LinkedHashSet;

public class RemoveDuplicate2ndApproach {

	public static void main(String[] args) {

		String s = "kavya";
		LinkedHashSet<Character> set = new LinkedHashSet();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		for (Character data : set) {
			System.out.print(data);
		}
	}
}
