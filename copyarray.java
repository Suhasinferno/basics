package Arraying;

import java.util.Arrays;

public class copyarray {

	public static void main(String[] args) {
		int[] arr = {12,13,14,145};
		int[] new_arr = new int[4];
		System.out.println("original array"+Arrays.toString(arr));
		for(int i=0;i<arr.length;i++)
		{
			new_arr[i]=arr[i];
		}
		System.out.println("copied array"+Arrays.toString(new_arr));

	}

}
