import java.util.Scanner;

public class Array2d {
	
	
	public static void main(String []args)
	
	{
		
	System.out.println("enter number of rows and coloumn");
	Scanner sc=new Scanner(System.in);
	int i=sc.nextInt();
	int j=sc.nextInt();
	int [] [] arr=new int [i][j];
		
		Arrayaccept.accept2d(arr);
		Arraydisplay.display2d(arr); 
		ArraySum2d.sum(arr);
	
		
		

		System.out.println("enter number of rows and coloumn for second 2d array");
	
		int k=sc.nextInt();
		int l=sc.nextInt();
		int [] [] arr1=new int [k][l];
			
		
			Arrayaccept.accept2d(arr1);
			Arraydisplay.display2d(arr1); 
			ArraySum2d.sum(arr1);
	
			ArraySum2d.sumoftwotwodarray(arr,arr1);
	}

}
