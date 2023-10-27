import java.util.Scanner;
public class MinandMaxofarray
{
	
public static void main(String []args)
{
	
	System.out.println("enter no of elements for 1 d array");
	Scanner sc=new Scanner(System.in);
	int size=sc.nextInt();
	int []arr=new int[size];
	System.out.println("enter array elements for 1 d array");
	
	for(int j=0;j<arr.length;j++)
	{
	
	   arr[j]=sc.nextInt();
			

	}
	min(arr);
	max(arr);
	
}



public static void min(int [] arr)
{
	int min=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		
		
		if(min>arr[i])
		{
			min=arr[i];
		}
		
	}
	System.out.println(min);
	
}

public static void max(int [] arr)
{
	int max=arr[0];
	for(int i=0;i<arr.length;i++)
	{
		
		
		if(max<arr[i])
		{
			max=arr[i];
		}
		
	}
	System.out.println(max);
	
}



}
