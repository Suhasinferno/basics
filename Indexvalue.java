package Arraying;

public class Indexvalue {

	public static void main(String[] args) {
		int[] arr = {13,23,24,22};
		int item =13;
		System.out.println(findIndex(arr,item));

	}
	public static int findIndex(int[] arr,int item)
	{
		if(arr == null)
		{
			return -1;
		}
		int len =arr.length;
		int i=0;
		while(i<len)
		{
			if(arr[i] == item)
			{
				return i;
			}
			else
				i++;
			
		}
		return -1;
	}
	

}
