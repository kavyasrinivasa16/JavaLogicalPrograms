package StringStatementPrgm;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueWords {

	public static void main(String[] args) {

		String s = "welcome to tp welcome to gc18";
		String[] str = s.split(" ");

		HashMap<String, Integer> map = new HashMap();

		for (int i = 0; i < str.length; i++) {
			String word = str[i];

			if (map.containsKey(word)) {
				map.put(word, map.get(word) + 1);
			} else
				map.put(word, 1);
		}
		for (Map.Entry<String, Integer> data : map.entrySet()) {

			if (data.getValue() == 1) {
				System.out.print(data.getKey() + " ");
			}
		}

	}

}
