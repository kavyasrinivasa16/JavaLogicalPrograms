package JavaAssignmenet;

public class MethodOverLoading {

	
	static void send(int num)
	{
		System.out.println(num);
	}
	static void send(String msg)
	{
		System.out.println(msg);
	}
	static void send(int num,String msg)
	{
		System.out.println(num+" "+msg);
	}
	static void send(String msg,int num)
	{
		System.out.println(msg+" "+num);
	}
	public static void main(String[] args) {
		send(123);
		send("KAVYA");
		send(123,"kav");
		send("kush",456);

	}

}
