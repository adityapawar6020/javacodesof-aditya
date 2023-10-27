import java.util.Scanner;
public class Array
{
	
	

		public static void main(String[] args) 
		{
			
			
			System.out.println("enter array length");
		    Scanner sc=new Scanner(System.in);
		    int i=sc.nextInt();
		    	
		    int [] arr=new int[i];
		    

		    Arrayaccept.accept(arr);
			Arraydisplay.display(arr);
			ArraySum.sum1d(arr);
			
			

			System.out.print("enter array  length for second asrray");
		 
		    int j=sc.nextInt();

		    	
		    int [] arr1=new int[j];
		    Arrayaccept.accept(arr1);
		    Arraydisplay.display(arr1);
		    ArraySum.sum1d(arr);
		    ArraySum.oftwoonedarray(arr, arr1);
		   
		    
			
			

		}

}




