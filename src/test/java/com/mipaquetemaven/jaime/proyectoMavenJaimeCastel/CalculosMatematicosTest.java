package com.mipaquetemaven.jaime.proyectoMavenJaimeCastel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;


class CalculosMatematicosTest {

	@Test
	void testEsPrimo() {
		equals(CalculosMatematicos.esPrimo());
	}

	@Test
	void testPotencia() {
		equals(CalculosMatematicos.potencia());
	}

	@Test
	@ValueSource(ints= {6,9,56,4,7})
	void testFactorial(int n) {
		equals(CalculosMatematicos.factorial(n));
	}

}
