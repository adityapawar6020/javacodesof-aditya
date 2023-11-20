package Question2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccepetString
{
	static List<String> list = new ArrayList<>();
	static List<String> list1 = new ArrayList<>();
	public static void accept()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string :");
		String word = sc.nextLine();
		list.add(word);
		list.add("Apple");
		list.add("Ball");
		list.add("Cat");
		list.add("Prathamesh");
	}
	
	public static void lengreat()
	{
		for(String s : list)
		{
			if(s.length()>5)
			{
				list1.add(s);
			}
		}
	}
	public static void main(String[] args) {
		

		accept();
		lengreat();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("Data.txt"));) 
		{
			for(String ss : list1)
			{
				bw.write(ss+"\n");
			}
		} catch (IOException e) {
			System.out.println("Error");
		}
		
		
	}

}
