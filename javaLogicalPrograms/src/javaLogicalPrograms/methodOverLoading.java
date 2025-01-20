package javaLogicalPrograms;

public class methodOverLoading {
	
	void send(int num)
	{
		System.out.println("sending num " + num);
	}
	
	void send(String msg)
	{
		System.out.println("sending msg " + msg);
	}
	
	void send(int num, String msg)
	{
		System.out.println("sending num and msg " + num + " " + msg);
	}

	void send(String msg, int num)
	{
		System.out.println("sending msg and num " + msg + " " + num);
	}
	
	public static void main(String[] args) {
		methodOverLoading mol = new methodOverLoading();
		mol.send(123);
		mol.send("hai kavya");
		mol.send(123, "hello kavya");
		mol.send("bye", 789);
	}
}
