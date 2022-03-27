package calculator.math;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.daniel.wit.math.MathOperation;

class MathOperationTest {
	
	MathOperation math;
	BigDecimal TEN;
	
	@BeforeEach
	public void setUp() {
		math = new MathOperation();
		TEN = new BigDecimal(10);
	}
	
	@Test
	@DisplayName("Simple sum should work")
	void sum() {
		assertEquals(TEN, math.sum(new BigDecimal(5), new BigDecimal(5)));
	}
	
	@Test
	@DisplayName("Simple subtraction should work")
	void subtract() {
		assertEquals(TEN, math.subtract(new BigDecimal(15), new BigDecimal(5)));
	}
	
	@Test
	@DisplayName("Simple multiplication should work")
	void multiply() {
		assertEquals(TEN, math.multiply(new BigDecimal(2), new BigDecimal(5)));
	}
	
	@Test
	@DisplayName("Simple division should work")
	void divide() {
		assertEquals(TEN, math.divide(new BigDecimal(50), new BigDecimal(5)));
	}

}
