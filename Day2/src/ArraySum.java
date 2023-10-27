import java.util.Scanner;

public class ArraySum {
	
	public static void sum1d(int [] arr)
	
	{
		
		
		System.out.println("sum is");
		
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		
			sum=sum+arr[i];
		}
		System.out.println(sum);
	}
	
	public static void oftwoonedarray(int [] arr,int []arr1)
	
	{
		
		int [] temp=new int[arr.length];
		System.out.print("addition of elements of two one d array is [");
		for(int i=0;i<arr.length;i++)
		{
		temp[i]=arr[i]+arr1[i];
		
		
		System.out.print(temp[i]+" ");
	
		
		
		
	

}
		System.out.print("]");
	}
	}
