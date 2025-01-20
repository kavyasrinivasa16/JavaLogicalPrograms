package StringMediumScalePrgms;

public class CountNumOfUpper_Lower_Num_SpeChar {

	public static void main(String[] args) {

		String s = "KaVyA6786$#%";
		int upperCount = 0;
		int lowerCount = 0;
		int numCount = 0;
		int speCount = 0;

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 'A' && ch >= 'Z') {
				upperCount += 1;
			} else if (ch >= 'a' && ch >= 'z') {
				lowerCount += 1;
			} else if (ch >= '0' && ch >= '9') {
				numCount += 1;
			} else {
				speCount += 1;
			}
		}
		System.out.println("upperCount = " + upperCount);
		System.out.println("lowerCount = " + lowerCount);
		System.out.println("numCount = " + numCount);
		System.out.println("speCount = " + speCount);

	}

}
