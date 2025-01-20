package StringMediumScalePrgms;

public class FirstLetterToUppercase {

	public static void main(String[] args) {

		String s = "welcome to tp office"; 				// o/p = Welcome To Tp Office
		String[] str = s.split(" "); 								// |welcome|to|tp|office|

		for (int i = 0; i < str.length; i++) {
			String s1 = str[i];
			String s2 = Character.toUpperCase(s1.charAt(0)) + s1.substring(1);
			System.out.print(s2 + " ");

		}

	}

}
