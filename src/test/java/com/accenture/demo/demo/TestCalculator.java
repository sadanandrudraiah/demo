package com.accenture.demo.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testAdd() {
		Calculator c = new Calculator();
		assertEquals(10, c.add(5, 5));
		
	}

}
