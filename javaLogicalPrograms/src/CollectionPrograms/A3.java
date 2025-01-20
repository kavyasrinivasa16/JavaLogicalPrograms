package CollectionPrograms;

import java.util.ArrayList;

public class A3 {

	public static void main(String[] args) {


		ArrayList a = new ArrayList();
		a.add("panipuri");
		a.add("frenchfries");
		a.add("pizza");
		a.add("kfc");
		a.add("biriyani");
		a.add(0, "masaladosa");
		
		System.out.println(a);
		
		System.out.println(a.contains("panipuri"));
		System.out.println(a.indexOf("pizza"));
		
		
		//convert list into array
		Object[] o = a.toArray();
		
		

	}

}
