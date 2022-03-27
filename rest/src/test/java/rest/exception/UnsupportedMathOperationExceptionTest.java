package rest.exception;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.daniel.wit.exception.UnsupportedMathOperationException;

public class UnsupportedMathOperationExceptionTest {
	
	UnsupportedMathOperationException unsupportedMathOperationException;
	
	@Test
	@DisplayName("Constructor Test")
	public void constructorTest() {
		unsupportedMathOperationException = new UnsupportedMathOperationException("You need to set a numeric vale.");
	}

}
