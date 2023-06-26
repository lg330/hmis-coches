package org.hmis;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.Test;

public class CocheTest {

	@Test
	void testEqualsObject() {
		Coche c = new Coche(); // Arrange
		assertTrue(c.equals(c)); // Action // Assert
	}

	@Test
	void testEqualsObjectNull() {
		Coche c = new Coche(); // Arrange
		Coche c2 = null;
		assertFalse(c.equals(c2)); // Action // Assert
	}

	@Test
	void testEqualsObjectString() {
		Coche c = new Coche(); // Arrange
		String c2 = "";
		assertFalse(c.equals(c2)); // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple1() {
		Coche primero = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche("Toyota", "Corolla", 2022, 22000);
		assertEquals(true, primero.equals(segundo)); // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple2() {
		Coche primero = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche("Toyota", "Corolla", 2023, 22000);
		assertEquals(false, primero.equals(segundo)); // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple3() {
		Coche primero = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche("Nissan", "Corolla", 2022, 22000);
		assertEquals(false, primero.equals(segundo)); // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple4() {
		Coche primero = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche("Toyota", "Auris", 2022, 22000);
		assertEquals(false, primero.equals(segundo)); // Action // Assert
	}

	@Test
	void testEqualsObjectMultiple5() {
		Coche primero = new Coche("Toyota", "Corolla", 2022, 22000);
		Coche segundo = new Coche("Toyota", "Corolla", 2022, 32000);
		assertEquals(false, primero.equals(segundo)); // Action // Assert
	}

	@ParameterizedTest
	@CsvSource({ "Toyota", "Audi", "Chevrolet", "Fiat" })
	void testGetterMarca(String marca) {
		Coche c = new Coche(marca, "", 0, 0);
		assertEquals(marca, c.getMarca());
	}

	@ParameterizedTest
	@CsvSource({ "Corolla", "Q5", "Camaro", "500" })
	void testGetterModelo(String modelo) {
		Coche c = new Coche("", modelo, 0, 0);
		assertEquals(modelo, c.getModelo());
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4 })
	void testGetterAño(int anio) {
		Coche c = new Coche("", "", anio, 0);
		assertEquals(anio, c.getAnio());
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4 })
	void testGetterPrecio(int precio) {
		Coche c = new Coche("", "", 0, precio);
		assertEquals(precio, c.getPrecio());
	}
	
	@ParameterizedTest
	@CsvSource({ "Toyota", "Audi", "Chevrolet", "Fiat" })
	void testSetterMarca(String marca) {
		Coche c = new Coche("", "", 0, 0);
		c.setMarca(marca);
		assertEquals(marca, c.getMarca());
	}

	@ParameterizedTest
	@CsvSource({ "Corolla", "Q5", "Camaro", "500" })
	void testSetterModelo(String modelo) {
		Coche c = new Coche("", "", 0, 0);
		c.setModelo(modelo);
		assertEquals(modelo, c.getModelo());
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4 })
	void testSetterAño(int anio) {
		Coche c = new Coche("", "", 0, 0);
		c.setAnio(anio);
		assertEquals(anio, c.getAnio());
	}

	@ParameterizedTest
	@ValueSource(ints = { 1, 2, 3, 4 })
	void testSetterPrecio(int precio) {
		Coche c = new Coche("", "", 0, 0);
		c.setPrecio(precio);
		assertEquals(precio, c.getPrecio());
	}

}
