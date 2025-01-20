package JavaAssignmenet;

public class AddNumberInString {

	public static void main(String[] args) {
		// asc123bsd4
		String s = "asc123bsd4";

		int i = 0, sum = 0, n = 0, m = 0;
		for (i = 0; i <= s.length() - 1; i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9')
			{
				n=s.charAt(i);
				m=n-48;
				sum=m+sum;
			}
		}
		System.out.println("sum : "+sum);

	}

}
