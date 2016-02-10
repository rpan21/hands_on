package com.examples;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TestCase {

 private int number;
 
 public TestCase(int number) {

this.number=number;
 
}

@Parameters
 public static Collection<Object[]> data() {
   Object[][] data = new Object[][] { { 12 }, { 24 }, { 3 }, { 6 } };
   return Arrays.asList(data);
 }



	@Before
	public void setUp() throws Exception {
		PerfectNumber obj = new PerfectNumber(number);
		
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(" Test completed");
	}

	@Test
	public void test() {
		
		
			
		fail("Not yet implemented");
	}

}
