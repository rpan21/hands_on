package com.promo;

public class Employee implements Cloneable {

	
	private long empId;
	private String enmae;
	
	
	public Employee(long empId, String enmae) {
		super();
		this.empId = empId;
		this.enmae = enmae;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return super.clone();
	}


	public long getEmpId() {
		return empId;
	}


	public void setEmpId(long empId) {
		this.empId = empId;
	}


	public String getEnmae() {
		return enmae;
	}


	public void setEnmae(String enmae) {
		this.enmae = enmae;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", enmae=" + enmae + "]";
	}

	
	
}
