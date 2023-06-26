package org.hmis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

public class MainTest {

	@Test
	void mainNoNulo() {
		Main main = new Main();
		assertNotNull(main);
	}
	
	@Test
	void mainFunciona() {
		Main.main(null);
	}
}
