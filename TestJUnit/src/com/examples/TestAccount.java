package com.examples;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestAccount {
	BankAccount obj = null;
	BankAccount obj1 = null;
	@Before
	public void setUp() throws Exception {
		
		obj=new BankAccount(121, "Rajesh", 12000);
	}

	@After
	public void tearDown() throws Exception {
	}

	

	@Test
	public void testnotNullConstructorsValue()throws Exception {
		String name = obj.getAccountHolder_name();
		long id=obj.getAccount_no();
		double balance=obj.getBalance();
		assertNotNull(name);
		assertNotNull(id);
		assertNotNull(balance);
			
		
		//fail("Not yet implemented");
	}

	@Test
	public void testReturnSameValueFromConstructors() throws Exception{
		assertEquals(12000.0, obj.getBalance(),0);
		assertEquals(121, obj.getAccount_no());
		assertEquals("Rajesh", obj.getAccountHolder_name());
			
		
		//fail("Not yet implemented");
	}

	@Test
	public void testNonNegativeDepositReturn() throws Exception{
	 double actual = obj.deposit(2000);
		
		assertTrue("deposit can't be -ve",actual>0.0 );
	}
	
	@Test
	public void testNonNegativeWithdrawReturn()throws Exception {
	 double actual = obj.withdrawl(2000.0);
		
		assertFalse("overdraft not allowed ",actual<0.0 );
	}
	
	
	@Test(timeout=100)
	public void testInfiniteLoop() {
	
		obj.withdrawl(1000);
		
	}
	
	@Test
	public void testDepositCheck() throws Exception{
	   double bal = obj.getBalance();
	   
		double bal1 = obj.withdrawl(1000);
		
		assertTrue("withdrawl method not working or balance is too low to withdraw amount requested",bal!=bal1);
		
	}

	@Test
	public void testnotNullValueException() throws Exception{
		try{
			//obj1=new BankAccount(121, null, 12000);
			fail("value should not be null");
	}
	catch(Exception e)
	{
		
	}
		}
	
}
