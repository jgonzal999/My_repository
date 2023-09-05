package com.service;

import static org.junit.Assert.*;
import org.junit.Test;



public class OperationTest {

	@Test //esto es como si fuera un main method
	public void testAdd() {
//		fail("Not yet implemented");
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300, result);
	}

}
