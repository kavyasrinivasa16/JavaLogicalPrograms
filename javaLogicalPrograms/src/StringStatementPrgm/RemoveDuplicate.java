package StringStatementPrgm;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDuplicate {

	public static void main(String[] args) {

		String s = "welcome to tp welcome to gc18";
		String[] str = s.split(" ");

		LinkedHashMap<String, Integer> map = new LinkedHashMap();

		for (int i = 0; i < str.length; i++) {
			String word = str[i];

			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else
				map.put(word, 1);
		}
		for (Map.Entry<String, Integer> data : map.entrySet()) {

			System.out.print(data.getKey() + " ");

		}

//		LinkedHashSet<String> set = new LinkedHashSet();
//
//		for (int i = 0; i < str.length; i++) {
//			set.add(str[i]);
//		}
//		for (String data : set) {
//			System.out.print(data+" ");
//		}

	}

}
