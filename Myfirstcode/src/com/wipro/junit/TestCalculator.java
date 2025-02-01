package com.wipro.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
 
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
 

import org.junit.jupiter.api.Test;

class TestCalculator {

private final Calculator calculator = new Calculator();
 
	
	/*
	 * @BeforeEach void setUp() { calc = new Calculator(); }
	 * 
	 * @Test void testAddition() { assertEquals(9, calc.add(4,
	 * 5),"2 + 3 should be 5"); }
	 * 
	 * @Test void testSubtraction() { assertEquals(2,
	 * calc.subtract(5,3),"5-3 should be 2"); }
	 * 
	 * @AfterEach void t() { calc = null; }
	 */
	/*
	 * @Test void testDivision() { assertThrows(ArithmeticException.class, ()->
	 * calc.divide(10,0),"should throw division by zero execption"); }
	 * 
	 * @AfterEach
	 * 
	 * void t() { calc = null; }
	 */
	@ParameterizedTest
	@CsvSource({"2,3,5","4,6,10","10,20,30"})
	void testAdditionParameterized(int a, int b, int expected) {
		assertEquals(expected, calculator.add(a, b));
	}

}
