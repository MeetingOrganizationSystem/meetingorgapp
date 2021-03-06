package com.vforum.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.vforum.validation.EmployeesModelValidator;

public class TestRegisterEmployeeModelValidator {
	private EmployeesModelValidator validator=null;

	@Before
	public void setUp() throws Exception {
		validator=new EmployeesModelValidator();
	}

	@After
	public void tearDown() throws Exception {
		validator=null;
	}

	@Test
	void testValidString_positive() {
		
		boolean actual=validator.validString("sabbir");
		assertEquals(true,actual);
    	}
	@Test
	void testValidString_negative() {
		
		boolean actual=validator.validString("sabbir111");
		assertEquals(false,actual);
    	}
	
}
