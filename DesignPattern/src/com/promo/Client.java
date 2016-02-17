package com.promo;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee obj = new Employee(101,"rahul");
		Employee proto = null;
		System.out.println("Original : "+ obj);
		try
		{
			proto = (Employee)obj.clone();
			proto.setEnmae("Mr. "+proto.getEnmae());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Original =: "+obj);
		System.out.println("ProtoType =: "+proto);
		
	}

}
