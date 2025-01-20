package ArrayPrgms;

import java.util.HashMap;
import java.util.Map;

public class PrintUnique {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 2, 4, 1, 5 };

		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int ch = arr[i];
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Integer, Integer> data : map.entrySet()) {
			if (data.getValue() == 1) {
				System.out.print(data.getKey() + " ");
			}
		}
	}

}
