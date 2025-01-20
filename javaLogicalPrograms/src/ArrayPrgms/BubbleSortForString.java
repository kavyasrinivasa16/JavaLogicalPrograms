package ArrayPrgms;

import java.util.Arrays;

public class BubbleSortForString {

	public static void main(String[] args) {

		String[] input = { "my", "name", "is", "kavya" };
		int count = input.length;

		for (int i = 0; i < input.length - 1; i++) {
			for (int j = 0; j < count - i - 1; j++) {
				if (input[j].compareTo(input[j + 1]) > 0) {
					String temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(input));

	}

}
