package rest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.daniel.wit.StartupApplication;

public class StartupApplicationTest {

	@Test
	@DisplayName("Startup application")
	public void main() {
		StartupApplication.main(new String[] {});
	}
}
