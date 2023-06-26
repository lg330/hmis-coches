package org.hmis;

import static org.junit.jupiter.api.Assertions.*;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.*;

class JsonReaderTest {

	@Test
	void JsonReaderNoNulo() {
		JsonReader json = new JsonReader();
		assertNotNull(json);
	}

	@ParameterizedTest
	@CsvSource({ "data/coches.json,4", "data/coches2.json,6" })
	void testLeerCochesJSON(String ruta, int longitud) {
		Coche[] coches = JsonReader.leerCochesJSON(ruta);
		assertEquals(longitud, coches.length);
	}

	@ParameterizedTest
	@MethodSource("datos")
	void testLeerCochesJSONprimero(String ruta, Coche primero) {
		Coche[] coches = JsonReader.leerCochesJSON(ruta);
		assertEquals(primero, coches[0]);
		assertTrue(primero.equals(coches[0]));
		assertTrue(coches[0].equals(primero));
	}

	@ParameterizedTest
	@CsvSource({ "data/archivoNoExistente.json", "data/cochess.json" })
	void testExcepcionJSON(String ruta) {
		assertDoesNotThrow(() -> {
				JsonReader.leerCochesJSON(ruta);
		});
	}

	private static List<Arguments> datos() {

		String ruta1 = "data/coches.json";
		Coche coche1 = new Coche("Toyota", "Corolla", 2022, 22000);

		String ruta2 = "data/coches2.json";
		Coche coche2 = new Coche("Seat", "Toledo", 2007, 4500);

		return Arrays.asList(Arguments.of(ruta1, coche1), Arguments.of(ruta2, coche2));
	}
}
