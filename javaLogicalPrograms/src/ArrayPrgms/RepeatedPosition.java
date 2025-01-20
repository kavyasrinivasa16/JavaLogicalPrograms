package ArrayPrgms;

public class RepeatedPosition {

	public static void main(String[] args) {

		int[] a = { 1, 12, 12, 12, 15, 1, 6, 6, 5, 5 };

		for (int i = 0; i < a.length; i++) {
			boolean flag = true;
			String s = a[i] + "-";
			int count = 0;

			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (j < i) {
						flag = false;
						break;
					} else if (i != j) {
						s = s + j + ",";
						count++;
					}
				}
			}

			if (flag && count > 0) {
				System.out.println(s);
			}
		}

	}
}

