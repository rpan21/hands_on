package examples;

public class Employee {

	private long emp_id;
	private String ename;
	private double salary;
	
	
	public enum Emp_type
	{
		UNSKILLED , SEMISKILLED , SKILLED
	};
	private Emp_type emp_type;

	public Employee(long emp_id, String ename, double salary,Emp_type emp_type) throws Empexception {
		
	if(emp_type.ordinal()==0 && salary<8500)
		throw new Empexception(8500);
	if(emp_type.ordinal()==1 && salary<9500)
		throw new Empexception(9500);
	if(emp_type.ordinal()==2 && salary<10500)
		throw new Empexception(10500);
	else
	{
		this.emp_id = emp_id;
		this.ename = ename;
		this.salary = salary;
		this.emp_type = emp_type;
	}
	
	
	}

	@Override
	public String toString() {
		return "Employee \n emp_id=" + emp_id + " \n ename=" + ename + "\n salary=" + salary + "\n emp_type=" + emp_type
				+ "";
	}
	
	
	
	
	
	
}
