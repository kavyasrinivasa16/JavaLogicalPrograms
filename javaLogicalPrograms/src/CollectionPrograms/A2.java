package CollectionPrograms;

import java.util.ArrayList;

public class A2 {

	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add("kavya");
		a.add("rohith");
		a.add("kushi");
		System.out.println(a);
		
		a.remove(0);
		System.out.println(a);
		
		a.remove("rohith");
		System.out.println(a);
		
		a.clear();
		System.out.println(a);
	}

}
