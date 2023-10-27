
import java.util.Scanner;

	public class PersonService 
	{

		   
		   static Person[] parr;
		   

		   //int arr[] in c++// in java int[] arr 
		   //varti lihilya war apan asda pan lihu shakto na 
		   //static Person[] parr=new Person[100]

		   static int cnt;
		   static
		   {
			   parr=new Person[100];
			   parr[0]= new Person (1,"sham","987");
			   parr[1]= new Person (2,"ram","765");
			   parr[2]= new Person (3,"ram","765");
			   parr[3]= new Person (4,"ram","765");
			   cnt=4;

		   }

		   public static void addperson()

		   {
			   Scanner sc =new Scanner(System.in);
			   System.out.println("enter pid");
			   int pid=sc.nextInt();
			   
			   
		       sc.nextLine();
			   System.out.println("enter pname");
			   String pname=sc.nextLine();


			   System.out.println("enter mobile");
			   String mobile=sc.next();

			   parr[cnt]=new Person(pid,pname,mobile);
			   cnt++;
			   


			 }

		   public static  void displayall() 
		   {

		   for(int i=0;i<cnt;i++)
		   {
			   System.out.println(parr[i]);
		   }

		   }

		   public static Person searchbyid(int id)
		   {
			   for(int i=0;i<cnt;i++)
			   {
				   if( parr[i].getid()==id)

				   {  return parr[i]; }



			   }
			   return null;
		   }

		  public static void searchbyname(String pname)

		  {
			  for(int i=0;i<cnt;i++)
			  {
				 if(parr[i].getpname().equals(pname))
				 {
					 System.out.println(parr[i]);
				 }



			  }

		  }
		  
		  public static void updatemob(int pid)
		  {
			  Scanner sc=new Scanner(System.in);
			  System.out.println("enter mobileno");
			  String mobileno=sc.next();
			  
			  for(int i=0;i<cnt;i++)
			  {

				   if( parr[i].getid()==pid)

				   {    parr[i].setmobile(mobileno); }

			  }
		  }


	}



