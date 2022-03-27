package rest.exception;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.daniel.wit.exception.ExceptionResponse;

public class ExceptionResponseTest {
	
	ExceptionResponse exceptionResponse;
	
	@SuppressWarnings("deprecation")
	@BeforeEach
	public void setUp() {
		exceptionResponse = new ExceptionResponse(new Date(2022, 3, 27, 19, 24, 10), "You need to set a numeric vale.", "uri=/divide");
	}

	@SuppressWarnings("deprecation")
	@Test
	@DisplayName("Return the timestamp")
	public void testGetTimestamp() {
		assertEquals(new Date(2022, 3, 27, 19, 24, 10), exceptionResponse.getTimestamp());
	}
	
	@Test
	@DisplayName("Return the message")
	public void testGetMessage() {
		assertEquals("You need to set a numeric vale.", exceptionResponse.getMessage());
	}
	
	@Test
	@DisplayName("Return the details")
	public void testGetDetails() {
		assertEquals("uri=/divide", exceptionResponse.getDetails());
	}
}
