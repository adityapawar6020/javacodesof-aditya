import java.time.LocalDate;

public class Salariedemploy extends Employe{
	
	private double sal;
    private double bonus;
    
    
	@Override
	public String toString() {
		return super.toString()+"Salariedemploy [sal=" + sal + ", bonus=" + bonus + "]";
	}

	public Salariedemploy() {
		super();
	}



	public Salariedemploy(int pid,String pname,String email,String mobile,String department, String designation, LocalDate doj,double sal, double bonus) {
		//super(pid,pname,email,mobile,department,designation, doj);
		this.sal = sal;
		this.bonus = bonus;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
    
	
    public double calculateBonus()
    {
    	return sal*0.10+bonus;
    }
	public double calculateSal()
	{
	
		
		return sal+bonus;
	
	
    }
    
	
	

}
