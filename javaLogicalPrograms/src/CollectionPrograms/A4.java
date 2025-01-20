package CollectionPrograms;

import java.util.ArrayList;

public class A4 {

	public static void main(String[] args) {
		

		ArrayList<String> a = new ArrayList();
		a.add("panipuri");
		a.add("frenchfries");
		a.add("pizza");
		a.add("kfc");
		a.add("biriyani");
		a.add(0, "masaladosa");
		
		for(int i =0; i<a.size();i++)
		{
			//System.out.println(a.get(i));
			
			//System.out.println(((String)(a.get(i))).length());
			
			System.out.println(a.get(i).length());
			
			
		}
	}

}
