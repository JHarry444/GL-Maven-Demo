package com.qa.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

	private Calculator calc = new Calculator();

	@Test
	void testAdd() {
		assertEquals(10, this.calc.add(3, 7));
	}

	@Test
	void testSubtract() {
		assertEquals(6, this.calc.subtract(10, 4));
	}

	@Test
	void testDivide() {

	}
}
