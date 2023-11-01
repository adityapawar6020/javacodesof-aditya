package com.demo.service;

import java.util.Scanner;

import com.demo.beans.Person;
import com.demo.dao.PersonDao;
import com.demo.dao.PersonDaoImpl;

public class PersonServiceImpl implements PersonService{
	
	private PersonDao pdao;
	
	//mahit nai kabar kela pan karun dyachanantar bagh kabar kela
	public PersonServiceImpl()
	{
		pdao= new PersonDaoImpl();
	}
	
	public void addperson()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int pid = sc.nextInt();
		System.out.println("enter name");
		String name = sc.next();
		System.out.println("enter mobile");
		String mobile = sc.next();
		
		Person p = new Person(pid,name,mobile);
		pdao.save(p);

	}
	
	
	public  Person displayByid(int pid)
	{
		return pdao.findById(pid);
	}

	@Override
	public Person[] displayall() {
		return pdao.findAll();
	}

}
