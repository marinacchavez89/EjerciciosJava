import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	/* @Test
	void testMain() {
		fail("Not yet implemented");
	} */
	
	@Test
	void testSumar() {			
		int resultado = Calculadora.sumar(70, 40);
		int resultado2 = Calculadora.multiplicar(resultado, 25);
		assertEquals(2700, resultado2);
		
	}

	@Test
	void testRestar() {
		int resultado = Calculadora.restar(90, 50);		
		int resultado2 = Calculadora.multiplicar(resultado, 15);
		assertEquals(605, resultado2);
	}

	@Test
	void testMultiplicar() {	
		int resultado = Calculadora.multiplicar(80, 3);
		assertEquals(240, resultado);
	}

	@Test
	void testDividir() {
		int resultado = Calculadora.sumar(150, 180);
		int resultado2 = Calculadora.dividir(resultado, 3);
		assertEquals(110, resultado2);
	}

}
