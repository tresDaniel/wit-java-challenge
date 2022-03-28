package calculator.util;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.daniel.wit.util.Utility;

class UtilityTest {

	@Test
	@DisplayName("Simple conversion should work")
	void testConvertToBigDecimal() {
		//final BigDecimal TEN = new BigDecimal(10);
		assertEquals(new BigDecimal(10), Utility.convertToBigDecimal("10"));
		assertEquals(new BigDecimal(0), Utility.convertToBigDecimal(null));
		assertEquals(new BigDecimal(0), Utility.convertToBigDecimal("A"));
		
	}
	
	@Test
	@DisplayName("Ensure it is a number")
	void testIsNumeric() {
		assertTrue(Utility.isNumeric("10"));
		assertFalse(Utility.isNumeric(null));
	}
}
