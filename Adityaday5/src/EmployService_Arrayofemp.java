import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import javax.swing.text.DateFormatter;
public class EmployService_Arrayofemp {

	static Employe[] emparr;
	static int cnt;
	
	static {
		
		
		emparr= new Employe[100];
		emparr[0]=new Salariedemploy(1,"sham","sham2@gmail.com","98345145725","ops","L1",LocalDate.of(1989,07,01),1340,13);
		emparr[1]=new Salariedemploy(2,"dham","dham2@gmail.com","956645145725","ops","L2",LocalDate.of(1969,07,01),1280,12);
		emparr[2]=new ContractEmploye(3,"dhruv","dhruv2@gmail.com","45657145725","ops","C1",LocalDate.of(1976,05,03),28,350);
	    emparr[3]=new ContractEmploye(4,"ruv","ruv2@gmail.com","23457145725","ops","C1",LocalDate.of(1983,06,02),38,330);
	    cnt=4;
	}
	

	
	  public static void addemp(int ch)
	  {
		  System.out.println("enter id");
		  Scanner sc=new Scanner(System.in);
		  int pid=sc.nextInt();
		  
		  System.out.println("entername");
		  String pname=sc.next();
		  
		  System.out.println("enter email");
		  String email=sc.next();
		  
		  System.out.println("enter mobilenumber");
		  String mobile=sc.next();
		  
		  
		  System.out.println("enter dept");
		  String department=sc.next();
		  
		  System.out.println("enter designation");
		  String designation=sc.next();
		  
		  
		  System.out.println("enter joining date");
		  String date=sc.next();
		  
		  LocalDate doj=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));		  
		  
		  switch(ch)
			  
		  
		  {
		  case 1:
			  System.out.println("enter salary");
			  double salary=sc.nextInt();
			  
			  
			  System.out.println("enter bonus");
			  int bonus=sc.nextInt();
			  
			  emparr[cnt]=new Salariedemploy( pid, pname, email, mobile,department, designation,  doj, salary, bonus);
			  
			  break;
		  case 2:
			  System.out.println("enter hrs");
			  int hrs=sc.nextInt();
			  
			  
			  System.out.println("enter charges");
			  int charges=sc.nextInt();
			  emparr[cnt]=new ContractEmploye(pid,pname, email, mobile,department,designation,doj,hrs,
						charges);
			  break;
			  
		  case 3:
			  System.out.println("create vendor");
			  break;
		  
		  
		  }
		  cnt++;
		  
	      }
	  
	  public static void displayall()
	  {
		  for( int i=0;i<cnt;i++)
		  { 
			  System.out.println(emparr[i]);
			  
		  }
	  }
	  
	  
	  
	  
	  public static double calculatesalarybyid(int pid)
	  
	  {
		  int pos=searchbyid(pid);
		  
			if (pos!=-1) {
			
				return emparr[pos].calculateSal();
			  
			             }
			return -1;
	  }
	  
	  
	  
	  
	  public static int  searchbyid(int pid)  
	  {
		  for(int i=0;i<cnt;i++)

	  {
			  
			  if(emparr[i].getPid()==pid)
			  {
				  return i;
			  }
	  }
			  return -1;
	  }
	  
	  public static boolean modifysalbyid(int pid,double s)
	  {
	  
	  int c=searchbyid(pid);
	 
	  if (c!=-1)
	 {
	  
	  if(emparr[c] instanceof Salariedemploy)
	   {
	      ((Salariedemploy)emparr[c]).setSal(s);
	      
	      
	   }
	  else if (emparr[c] instanceof ContractEmploye)
	  {
		  
	    ((ContractEmploye)emparr[c]).setCharges(s);
	  
	  }      
	  else
	  {System.out.println("vendor cha class nahi banavla ahe ajhun");
	  }       
	  return true;
	  }
	  
	  else
	  return false;
}
	  
	  public static boolean displaybyid(int id)
	  {
		  int cnt=searchbyid(id);
		  if(cnt!=-1)
		  {
			  //emparr[cnt].toString();
			  System.out.println(emparr[cnt].toString());
			  
		  
		   return true;
		   }
		  else
		  return false;
	  }
	  
	  
	  
//	  public static void calculateebonus()
//	  {
//
//		  Salariedemploy se=new Salariedemploy(1000,200);
//	         se.calculateBonus();
//		 
//	  }
//	  

	  
}

	  
	  
	  
			  
	