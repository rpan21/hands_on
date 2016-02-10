package examples;

import examples.Employee.Emp_type;

public class EmpApplication {

	public static void main(String[] args)
	{
		try
		{
			 Employee obj1 = new Employee(102, "rahul", 12000, Emp_type.UNSKILLED);
			    System.out.println(obj1.toString());
			Employee obj = new Employee(102, "rahul", 1200, Emp_type.UNSKILLED);
			 System.out.println(obj.toString());
	   
		
		}
		catch(Empexception ex)
		{
			System.err.println("\n"+ex.getMessage());
			
		}
		finally
		
		{
			System.out.println("\nEmp details");
		
		}
		
	}
}
