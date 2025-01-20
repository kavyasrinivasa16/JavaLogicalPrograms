package ArrayPrgms;

import java.util.Arrays;

public class LeftRotation {

	public static void main(String[] args) {

		String[] str = { "My", "name", "is", "kavya" };

		for (int i = 1; i <= 1; i++) {
			String temp = str[0];
			for (int j = 0; j < str.length - 1; j++) {
				str[j] = str[j + 1];
			}
			str[str.length - 1] = temp;
		}

		System.out.println(Arrays.toString(str));
	}

}
