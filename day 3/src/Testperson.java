import java.util.Scanner;

public class Testperson {
	
	public static void main(String args[])
	{	
		Scanner sc=new Scanner(System.in);
	
	Person p=new Person(1,"Aditya","9876543210");
    System.out.println(p);
    p.Setpid(69);
    System.out.println(p);
    
//    System.out.println("Given me name to search");
//    String str=sc.next();
//    
//    PersonService.searchbyname(str);
    
    PersonService.addperson();
    PersonService.displayall();
}
}