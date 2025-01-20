package PRACTICE_25_06_2024;

public class MethodOverLoading {

	static void send(int a) {
		System.out.println(a);
	}

	static void send(String b) {
		System.out.println(b);
	}

	static void send(int c, String d) {
		System.out.println(c + d);
	}

	static void send(String e, int f) {
		System.out.println(e + f);
	}

	public static void main(String[] args) {

		send(16);
		send("Kavya");
		send(7, " Kushii");
		send("Rohii ",27);
	}

}
