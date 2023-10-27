import java.util.Scanner;

public class Factorial {

	public static void main(String[] args)
	
	{
		
		//int num=
		 int ans=1;
	    Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++)
		{
		
		  ans=ans*i;
		 
		}
		  System.out.println("answer is "+ans);
	
	 }
}

