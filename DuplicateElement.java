package basicCodes;

public class DuplicateElement {
	public static void main(String[] args)
	{
		int[] a = {1,2,2,3,4,5,6,6,8,9,1};
		System.out.print("the duplicate elements are");
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j] && (i!=j))
					System.out.print(a[j]+"");
					
			}
		}
		
		
	}

}
