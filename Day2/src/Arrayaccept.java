import java.util.Scanner;

public class Arrayaccept
{

	

    public static void accept(int [] arr)
    
    {
    	
    	
    	
    	 System.out.println("enter array elements");
		    
		    for(int j=0;j<arr.length;j++)
		    {
		    
		    	Scanner sc=new Scanner(System.in);
			arr[j]=sc.nextInt();
		    }
	
	
	}
    
    public static void accept2d(int [] [] arr)
    {
    	System.out.println("enter array element");
    	
    	for(int i=0;i<arr.length;i++)
    	{
    	for(int j=0;j<arr[0].length;j++)
    	{
    		Scanner sc = new Scanner(System.in);
    		arr[i][j]=sc.nextInt();
    	}	
    	
    }
    
    }}
