
public class ArraySum2d {

	public static void sum(int [] []arr)
	
	{
		System.out.println("sum of elements of 2d array is");
		int sum=0;
		for(int i=0;i<arr.length;i++)
			
		{
			for(int j=0;j<arr[0].length;j++)
			{
				sum=sum+arr[i][j];
				
			}
		}
		System.out.println(sum);
	}
	
	public static void sumoftwotwodarray(int [] []arr,int[][]arr1)
	
	{
		System.out.println("sum of elements of  two 2d array is");
		
		int [] [] sum=new int [arr.length][arr[0].length];
		for(int i=0;i<arr.length;i++)
			
		{
			for(int j=0;j<arr[0].length;j++)
			{
				sum[i][j]=arr[i][j]+arr1[i][j];
				System.out.print(sum[i][j] + "     ");
				
			}
			System.out.println(" ");
		}
	
	}
	
	
}
