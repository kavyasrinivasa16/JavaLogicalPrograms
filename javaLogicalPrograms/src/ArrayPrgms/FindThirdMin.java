package ArrayPrgms;

public class FindThirdMin {

	public static void main(String[] args) {
		int[] a = { 12, 15, 16, 98, 56 ,45};
		int min = Integer.MAX_VALUE;
		int sec_min = Integer.MAX_VALUE;
		int third_min = Integer.MAX_VALUE;

		for (int i = 0; i < a.length; i++) 
		{
			if (min > a[i]) 
			{
				third_min = sec_min;
				sec_min = min;
				min = a[i];
			} 
			else if (sec_min > a[i] && min!=a[i]) 
			{
				third_min = sec_min;
				sec_min = a[i];
			} 
			else if (third_min > a[i] && min!=a[i] && sec_min!=a[i]) 
			{
				third_min = a[i];
			}
		}
		System.out.println(third_min);

	}

}
