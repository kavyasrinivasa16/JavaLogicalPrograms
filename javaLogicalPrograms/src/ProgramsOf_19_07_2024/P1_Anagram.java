package ProgramsOf_19_07_2024;

import java.util.Arrays;

public class P1_Anagram {

	public static void main(String[] args) {

		String str1 = "Top";
		String str2 = "Pot";
		boolean flag = true;

		if (str1.length() != str2.length()) {
			flag = false;
			System.out.println("not an  anagram");
			return;
		} else {
			str1 = str1.toLowerCase();
			str2 = str2.toLowerCase();

			char[] ch1 = str1.toCharArray();
			char[] ch2 = str2.toCharArray();

			Arrays.sort(ch1);
			Arrays.sort(ch2);

			for (int i = 0; i < ch1.length; i++) {
				if (ch1[i] != ch2[i]) {
					flag = false;
					System.out.println("not anagram");
					break;
				}
			}
		}
		if (flag) {
			System.out.println("anagram");
		}

	}

}
