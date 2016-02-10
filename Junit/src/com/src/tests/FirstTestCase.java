package com.src.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.src.CurrencyConvertor;

public class FirstTestCase {
	CurrencyConvertor conv=null;
	@Before
	public void setUp() throws Exception {
		System.out.println("Before Called===================>");
		conv= new CurrencyConvertor();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After Called ======-------------------->");
		
	}

	@Test
	public void test1() {
		//fail("Not yet implemented");
		//CurrencyConvertor conv= new CurrencyConvertor();
		double actual = conv.dollarToRupees(10.0);
		assertEquals(1000.0,actual,0);
	}
	@Test
	public void test2() {
		//fail("Test 2 Not yet implemented");
		double actual = conv.dollarToRupees(10.0);
		assertNotNull(actual);
		
	}

}
