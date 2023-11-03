package com.demo.Dao;

import java.time.LocalDate;


import java.util.ArrayList;
import java.util.List;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employe;
import com.demo.beans.SalariedEmp;

public class Empdaoimpl implements Empdao {
	
static List<Employe> elist;
 
static
{
elist=new ArrayList<>();
elist.add(new SalariedEmp(12,"Rajat"," 0987654", "R@gmail","rme", "l2",LocalDate.of(2002, 12,30) ,1234, 23));
elist.add(new SalariedEmp(13,"Ajit","555","a22@gmail.com","admin","associate",LocalDate.of(2002, 10,30),4577,377));
elist.add(new ContractEmp(14,"Rajas","666","r345@gmail.com","admin","manager",LocalDate.of(2002, 12,30),30,4000));
elist.add(new ContractEmp(15,"Ashwini","777","ashu@gmail.com","hr","associate",LocalDate.of(2000, 12,30),40,5000));

}


@Override
public void save(Employe e) 
{
	
	elist.add(e);
	
}


@Override
public boolean remove(int id) {
	return elist.remove(new SalariedEmp(id));
}


@Override
public List<Employe> getall() {
	
	return elist;
	
}


@Override
public Employe getbyid(int id) {
	
	
	//omkar ne kela a parat bagh
	int pos= elist.indexOf(new SalariedEmp(id));
	return elist.get(pos);
}


@Override
public boolean alter(int id,double Amt) 
{
	
	Employe y=getbyid(id);
	
	if(y!=null)
{
		if(y instanceof SalariedEmp)
		
		{
			((SalariedEmp) y).setSal(Amt);
			
			
		}
		else if(y instanceof ContractEmp)
			
		{
			
			
			((ContractEmp)y).setCharges(Amt);
			
			
		}
		
	return true;
}
	return false;
		
}
	
}



