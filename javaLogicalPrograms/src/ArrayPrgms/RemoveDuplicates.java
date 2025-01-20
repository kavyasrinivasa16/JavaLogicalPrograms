package ArrayPrgms;

import java.util.LinkedHashMap;
import java.util.Map;

public class RemoveDuplicates {

	public static void main(String[] args) {

		int[] arr = { 1, 1, 2, 3, 2, 4, 1, 5 };

		LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			int ch = arr[i];
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}
		for (Map.Entry<Integer, Integer> data : map.entrySet()) {

			System.out.print(data.getKey() + " ");

		}

	}

}

//LinkedHashSet<Integer> map = new LinkedHashSet();
//
//for (int i = 0; i < arr.length; i++) {
//	map.add(arr[i]);
//}
//for (int data : map) {
//	System.out.println(data);
//}
