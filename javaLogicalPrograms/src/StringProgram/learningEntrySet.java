package StringProgram;

import java.util.HashMap;
import java.util.Map;

public class learningEntrySet {

	public static void main(String[] args) {
		
		HashMap<String, Integer> hs = new HashMap();
		hs.put("SKY", 63);
		hs.put("VK", 18);
		hs.put("RS", 45);
		
		for(Map.Entry<String, Integer> data: hs.entrySet())
		{
			System.out.print(data.getKey()+"-");
			System.out.print(data.getValue());
			System.out.println();
		}

	}

}
