import java.util.Scanner;

public class testStudent {
	public static void main(String[] args) {
		Student[]strr=new Student[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<strr.length;i++) {
			System.out.println("Enter id for student"+(i+1));
			int id=sc.nextInt();
			System.out.println("Enter name for student"+(i+1));
			sc.nextLine();
			String name=sc.next();
			System.out.println("Enter marks1 for student"+(i+1));
			int m1=sc.nextInt();
			System.out.println("Enter marks2 for student"+(i+1));
			int m2=sc.nextInt();
			System.out.println("Enter marks3 for student"+(i+1));
			int m3=sc.nextInt();
			strr[i]=new Student(id,name,m1,m2,m3);
		}
		System.out.println("student Details");
		for(int i=0;i<strr.length;i++) {
			System.out.println("Details of Student: "+(i+1));
			System.out.println(strr[i]);
		}
	}

}
