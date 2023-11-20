package adi;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BuffWriter {

	public static void main(String[] args) {
		
		Adiyaclass ob=new Adiyaclass("aditya",69);
		
		
		
		try(BufferedWriter bw=new BufferedWriter(new FileWriter("tea.txt"));) {
			
			
			
			
		    bw.write(ob.getId()+","+ob.getName());
		    System.out.println("sds");
	
			
			
		
		
		} catch (IOException e) {
			
			
		System.out.println("error");
			//e.printStackTrace();
		}
		
		

	}

}
