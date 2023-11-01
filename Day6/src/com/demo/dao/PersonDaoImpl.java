package com.demo.dao;

import com.demo.beans.Person;

public class PersonDaoImpl implements PersonDao{
	


 static Person[] parr;
 private static  int cnt;
  static 
  {
	  parr=new Person[100];
	  parr[0]= new Person(1,"xxx","33333");
	  parr[1]=new Person(2,"yyy","44444");
	  cnt=2;
  }
  
  
   public void save(Person p)
  {
	parr[cnt]=p;
	cnt++;
	}
  
	
 public	Person[] findAll()
	{
	 
	 return parr;
		
	}
	
public	Person findById(int pid)
{
	for( int i=0;i<cnt;i++)
	{
		if(parr[i].getPid()==pid)
		{
			return parr[i];
		}
	
	}
	return null;
}
	

  

}
