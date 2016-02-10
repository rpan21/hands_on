package com.src.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.src.StudentList;

public class TestApp2 {
	StudentList obj=null;
	@Before
	public void setUp() throws Exception {
		System.out.println("Before");
		obj = new StudentList();
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("After");
	}

	@Test
	public void test1() {
		int actual= StudentList.get((obj.getNames()).size());
		assertEquals(2, actual, 0);
		System.out.println("Set Implemented");
		//fail("Not yet implemented");
	}

	@Test
	public void test2() {
		int actual= StudentList.get((obj.getNames()).size());
		assertEquals(3, actual, 0);
		System.out.println("Ok SET IMPLEMENTED");
		//fail("Not yet implemented");
	}
}
