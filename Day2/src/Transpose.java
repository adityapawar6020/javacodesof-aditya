import java.util.Scanner;

public class Transpose {

		public static void main(String [] arg)
	{
		System.out.println("enter number of rows and coloumn elements-");
		Scanner sc=new Scanner(System.in);
		int k= sc.nextInt();
		int l= sc.nextInt();
		int [][]arr=new int[k][l];
		
		int [][]ans=new int[k][l];
        System.out.println("enter array elements for 2 d array");
		
		
		for( k=0;k<arr.length;k++)
			
			
		{
			for( l=0;l<arr[0].length;l++)
			{	
		
		   arr[k][l]=sc.nextInt();
			}	

		}
		transpose(arr,ans);
		display(ans);

		
	}
		
		
	public static void transpose(int [] [ ]arr,int [][]ans)
	{
		

	//	int [][]ans=new int[arr.length][arr[0].length];
	
		for( int i=0;i<arr.length;i++)
        {
			for( int j=0;j<arr[0].length;j++)
	      {	
		
		  if (i==j)
		  {
			 ans[i][j]=arr[i][j]; 
		  }
		  else
		  {
			  ans[i][j]=arr[j][i]; 
		  }
	     }
        }
	}		
		
		public static void display(int[][]ans)
		{
			
		System.out.println("array elements are");
		for (int i=0;i<ans.length;i++)
		{
		for(int j=0;j<ans[0].length;j++)
		{
		System.out.print(ans[i][j]+ "   ");
		}
		System.out.println();
		}
			
		
     }
}

