import java.time.LocalDate;
import java.util.Scanner;

public class testEmploye {
	public static void main(String args[])
	{
		Salariedemploy semp=new Salariedemploy(12,"aditya","adityapawar2@gmail.com","9834518655","it","sde",LocalDate.of(1999,04,15),1000,10);
        System.out.println(semp);
        
        double sss=semp.calculateSal();
        System.out.println(sss);
        
        ContractEmploye cemp=new ContractEmploye(13,"ramu","ramu@gmail.com","09876543212","rme","worker",LocalDate.of(1995,06,14),30,250);
        System.out.println(cemp);
        
        double ccc=cemp.calculateSal();
        System.out.println(ccc);
        
        Scanner sc=new Scanner(System.in);
        int i=sc.nextInt();
        
        
        
    }
}