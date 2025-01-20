package PRACTICE_25_06_2024;

public class SwapNumWithoutExtraVariable {

	public static void main(String[] args) {
		// 20. WAJP to swap numbers without using extra variable Ex: input1: a=10, b=20
		// output: a=20, b=10

		int a = 10;
		int b = 20;
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("a value = " + a);
		System.out.println("b value = " + b);

	}

}
