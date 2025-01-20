package ArrayPrgms;

import java.util.Arrays;

public class LeftRotationInteger {
	public static void main(String[] args) {

		int[] str = {10,15,8,5,7 };

		for (int i = 0; i <= 1; i++) {
			int temp = str[0];
			for (int j = 0; j < str.length - 1; j++) {
				str[j] = str[j + 1];
			}
			str[str.length - 1] = temp;
		}

		System.out.println(Arrays.toString(str));
	}


}
