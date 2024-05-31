package Arraying;

public class averagevalue {
	public static void main(String[] args)
	{
		int[] a = {22,44,55,66};
		int sum =0;
		for(int i=0;i<a.length;i++)
		{
			sum = sum + a[i];
		}
		int avg = sum /a.length;
		System.out.print("average value of an array is "+avg);
	}

}
