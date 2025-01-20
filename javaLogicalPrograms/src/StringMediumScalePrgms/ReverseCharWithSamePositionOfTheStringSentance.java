package StringMediumScalePrgms;

public class ReverseCharWithSamePositionOfTheStringSentance {

	public static void main(String[] args) {

		String s = "welcome to office";
		String[] str = s.split(" ");

		//otter for loop is used to iterate the array
		for (int i =0 ; i <str.length; i++) {
			String s1 = str[i];

			//inner for loop is used to reverse the String
			for (int j = s1.length() - 1; j >= 0; j--) {
				System.out.print(s1.charAt(j));
			}

			System.out.print(" ");
		}

	}

}
