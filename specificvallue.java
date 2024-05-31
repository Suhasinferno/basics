package Arraying;

public class specificvallue {

	public static void main(String[] args) {
		int[] a= {112,123,456,678,998,900};
		int item = 123;
		System.out.println(m2(a,item));
		

	}
	public static boolean m2(int[] a,int item)
	{
		for(int i:a)
		{
			if(item ==i)
			{
				return true;
			}
				
		}
		return false;
	}

}
