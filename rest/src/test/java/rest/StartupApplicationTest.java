package rest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.daniel.wit.StartupApplication;

class StartupApplicationTest {

	@Test
	@DisplayName("Startup application")
	void main() {
		StartupApplication.main(new String[] {});
	}
}
