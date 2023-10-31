import java.time.LocalDate;

abstract public class Employe  extends Person
{
	
	private String department;
	private String designation;
	private LocalDate doj;
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	public Employe(int pid,String pname,String email,String mobile,String department, String designation, LocalDate doj)
	{
		super(pid,pname,email,mobile);
		this.department = department;
		this.designation = designation;
		this.doj = doj;
	}
	public Employe() {
		super();
	}
	@Override
	public String toString() {
		return super.toString()+"Employe [department=" + department + ", designation=" + designation + ", doj=" + doj + "]";
	}
	
	abstract public double calculateSal();
	
}
