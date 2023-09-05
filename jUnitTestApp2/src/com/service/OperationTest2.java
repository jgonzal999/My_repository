package com.service;

import static org.junit.Assert.*;

import org.junit.Test;

public class OperationTest2 {

	@Test
	public void testAdd() {
		Operation op = new Operation();
		int result = op.add(100, 200);
		assertEquals(300, result);
	}

	@Test
	public void testSub() {
		Operation op = new Operation();
		int result = op.sub(100, 200);
		assertEquals(300, result);
	}

	@Test
	public void testMul() {
		Operation op = new Operation();
		int result = op.mul(100, 200);
		assertEquals(300, result);
	}

	@Test
	public void testDiv() {
		Operation op = new Operation();
		int result = op.div(100, 200);
		assertEquals(300, result);
	}

}
