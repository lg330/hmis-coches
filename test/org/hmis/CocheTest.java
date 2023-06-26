package org.hmis;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class CocheTest {

	@Test
	void testEqualsObject() {
		Coche c = new Coche ();   // Arrange
		assertTrue(c.equals(c));  // Action // Assert
	}
	
	@Test
	void testEqualsObjectNull() {
		Coche c = new Coche ();   // Arrange
		Coche c2 = null;
		assertFalse(c.equals(c2));  // Action // Assert
	}
	

	@Test
	void testEqualsObjectString() {
		Coche c = new Coche ();   // Arrange
		String c2 = "";
		assertFalse(c.equals(c2));  // Action // Assert
	}

	
	@Test
	void testEqualsObjectMultiple1() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple2() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2023, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple3() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Nissan", "Corolla", 2022, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple4() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Auris", 2022, 22000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple5() {
		Coche primero = new Coche ("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche ("Toyota", "Corolla", 2022, 32000);
		assertEquals(false, primero.equals(segundo));  // Action // Assert
	}
	
}
