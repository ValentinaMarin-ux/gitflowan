package main.test.com.miempresa.miapp;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.java.com.miempresa.miapp.Aritmetica;

class AritmeticaTest {

	@Test
	void testSumarPositivos() {
		double resultado = Aritmetica.sumar(2, 5);
		assertEquals(resultado, 7);
	}

	@Test
	void testSumarNegativos() {
		double resultado = Aritmetica.sumar(-2, -5);
		assertEquals(resultado, -7);
	}
	
	void testRestarPositivos() {
		double resultado = Aritmetica.restar(5, 2);
		assertEquals(resultado, 2);
	}
	
	@Test
	void testDivisionNegativos() {
		double resultado = Aritmetica.dividir(-10, -2);
		assertEquals(resultado, 5);
	}
	
	@Test
	void testDivisionExcepcion() {
		assertThrows(IllegalArgumentException.class, () -> {
			Aritmetica.dividir(-, 0);
		},"Deberia lanzar IllegalArgumentException ");
	}

}
