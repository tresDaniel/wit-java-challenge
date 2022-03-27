package calculator.util;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import com.daniel.wit.util.Utility;

public class UtilityTest {
	
//	@BeforeEach
//	void setUp() {
//		
//	}

	@Test
	@DisplayName("Simple conversion should work")
	public void testConvertToBigDecimal() {
		//final BigDecimal TEN = new BigDecimal(10);
		assertEquals(new BigDecimal(10), Utility.convertToBigDecimal("10"));
		assertEquals(new BigDecimal(0), Utility.convertToBigDecimal(null));
		assertEquals(new BigDecimal(0), Utility.convertToBigDecimal("A"));
		
	}
	
	@Test
	@DisplayName("Ensure it is a number")
	public void testIsNumeric() {
		assertTrue(Utility.isNumeric("10"));
		assertFalse(Utility.isNumeric(null));
	}
}
