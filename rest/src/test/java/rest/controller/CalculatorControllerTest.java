package rest.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigDecimal;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.daniel.wit.controller.CalculatorController;
import com.daniel.wit.exception.UnsupportedMathOperationException;

class CalculatorControllerTest {
	
	CalculatorController calculator;
	BigDecimal TEN;
	
	@BeforeEach
	public void setUp() {
		TEN = new BigDecimal(10);
		calculator = new CalculatorController();
	}
	
	@Test
	void sum() throws Exception {
		Throwable exception = assertThrows(UnsupportedMathOperationException.class, () -> calculator.sum("7", "A"));
		assertEquals("You need to set a numeric vale.", exception.getMessage());
		assertEquals(TEN, calculator.sum("4", "6"));
		
	}
	
	@Test
	void subtract() throws Exception {
		Throwable exception = assertThrows(UnsupportedMathOperationException.class, () -> calculator.subtract("7", "A"));
		assertEquals("You need to set a numeric vale.", exception.getMessage());
		assertEquals(TEN, calculator.subtract("14", "4"));
		
	}
	
	@Test
	void multiply() throws Exception {
		Throwable exception = assertThrows(UnsupportedMathOperationException.class, () -> calculator.multiply("7", "A"));
		assertEquals("You need to set a numeric vale.", exception.getMessage());
		assertEquals(TEN, calculator.multiply("2", "5"));
		
	}
	
	@Test
	void divide() throws Exception {
		Throwable exception = assertThrows(UnsupportedMathOperationException.class, () -> calculator.divide("7", "A"));
		assertEquals("You need to set a numeric vale.", exception.getMessage());
		assertEquals(TEN, calculator.divide("40", "4"));
		
	}
}
