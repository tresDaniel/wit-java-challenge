package rest.exception.handler;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.daniel.wit.exception.ExceptionResponse;
import com.daniel.wit.exception.handler.CustomizedResponseEntityExceptionHandler;

class CustomizedResponseEntityExceptionHandlerTest {

	CustomizedResponseEntityExceptionHandler handler;
	ExceptionResponse exceptionResponse;
	
	@BeforeEach
	public void setUp() {
		exceptionResponse = new ExceptionResponse(new Date(2022, 3, 27, 19, 24, 10), "You need to set a numeric vale.", "uri=/divide");
	}
	
	@Test
	void testHandleAllExceptions() {
		
	}
	
	@Test
	void testHandleBadRequestExceptions() {
		
	}
}
