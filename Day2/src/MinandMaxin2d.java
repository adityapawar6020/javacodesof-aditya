import java.util.Scanner;
public class MinandMaxin2d 
{
	
	public static void main(String []args)
	{
		
		System.out.println("enter no of elements for rows and colum in 2d array");
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		int l=sc.nextInt();
		
		int [][]arr=new int[k][l];
		
		
		System.out.println("enter array elements for 2 d array");
		
		
		for( k=0;k<arr.length;k++)
			
			
		{
			for( l=0;l<arr[0].length;l++)
			{	
		
		   arr[k][l]=sc.nextInt();
			}	

		}
		System.out.println("min value is");
		minn(arr);
		System.out.println("max value is");
		maxx(arr);
		
	
	}


	public static void minn(int [][] arr)
	{
		int min=arr[0][0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
			
			
			if(min>arr[i][j])
			
				min=arr[i][j];
			
			
			}
			
		}
			
		System.out.println(min);
		}
		
		

		
	
	
	
	public static void maxx(int [][] arr)
	{
		int max=arr[0][0];
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
			
			
			if(max<arr[i][j])
			
				max=arr[i][j];
			
			
			
		    }
		}
		System.out.println(max);
		
		}
		
	}

	



	

