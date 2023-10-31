import java.time.LocalDate;

public class ContractEmploye extends Employe {
	
	public ContractEmploye() {
		super();
	}

	private int hrs;
	private double charges;
	 
	public int getHrs() {
		return hrs;
	}
	public void setHrs(int hrs) {
		this.hrs = hrs;
	}
	public double getCharges() {
		return charges;
	}
	public void setCharges(double charges) {
		this.charges = charges;
	}
	@Override
	public String toString() {
		return super.toString()+ "ContractEmploye [hrs=" + hrs + ", charges=" + charges + "]";
	}
	
	public ContractEmploye(int pid,String pname,String email,String mobile,String department, String designation, LocalDate doj,int hrs,
	double charges)
	{
		super(pid,pname,email,mobile,department, designation,doj);
		this.hrs = hrs;
		this.charges = charges;
		
	}
	public double calculateSal()
	{
	
		
		return hrs*charges;
	
	
    }
}

	
	
	

	
	

	
	
	


