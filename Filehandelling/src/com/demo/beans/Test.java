package com.demo.beans;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {
	
	public static void main(String[] args) {
		
		List<friends> fl=new ArrayList<>();
		try(BufferedReader br=new BufferedReader(new FileReader("data.txt")))
				{
				
			     String str=br.readLine();
			     while(str!=null)
			     
			     {
			    	 String[] arr=str.split(",");
			    	 fl.add(new friends(Integer.parseInt(arr[0]),arr[1],arr[2]));
			     str=br.readLine();
			    	 
			    	 
			     }
			     System.out.println(fl);
			     
			       
			
				}catch(IOException e) {
					System.out.println("end of file");
				}
				
		
		
		
	}

}
