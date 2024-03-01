import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculadoraTest {
	
	@ParameterizedTest
	@CsvSource({"3, 2, 5",
				"7, 3, 10",
				"10, 3, 13"})
	//Prueba de método que toma dos enteros como parámetros y los suma.
	void testSumar(int a, int b, int valorEsperado) {
		//Usamos el método para obtener el resultado.
		int resultado = Calculadora.sumar(a, b);
		//Comparamos el resultado con el valor esperado.
		assertEquals(valorEsperado, resultado);
	}
	
	@ParameterizedTest
	@CsvSource({"20, 3, 17",
				"6, 2, 4",
				"23, 11, 12"})
	//Prueba de método que toma dos enteros como parámetros y resta el segundo al primero.
	void testRestar(int a, int b, int valorEsperado) {
		//Usamos el método para obtener el resultado.
		int resultado = Calculadora.restar(a, b);
		//Comparamos el resultado con el valor esperado.
		assertEquals(valorEsperado, resultado);
	}
	
	@ParameterizedTest
	@CsvSource({"6, 50, 300",
				"7, 3, 21",
				"30, 8, 240"})
	//Prueba de método que toma dos enteros como parámetros y los multiplica.
	void testMultiplicar(int a, int b, int valorEsperado) {
		//Usamos el método para obtener el resultado.
		int resultado = Calculadora.multiplicar(a, b);
		//Comparamos el resultado con el valor esperado.
		assertEquals(valorEsperado, resultado);
	}

	@ParameterizedTest
	@CsvSource({"128, 4, 32",
				"33, 3, 11",
				"75, 5, 15"})
	//Prueba de método que toma dos enteros como parámetros y divide el primero entre el segundo. 
	void testDividir(int a, int b, int valorEsperado) {
		//Usamos el método para obtener el resultado.
		int resultado = Calculadora.dividir(a, b);
		//Comparamos el resultado con el valor esperado.
		assertEquals(valorEsperado, resultado);
	}
	
	@ParameterizedTest
	@CsvSource({"7, 28",
				"6, 21",
				"13, 91"})
	//Prueba de método que toma un entero como parámetro y devuelve su sumatorio.
	void testSumatorio(int a, int valorEsperado) {
		//Usamos el método para obtener el resultado.
		int resultado = Calculadora.Sumatorio(a);
		//Comparamos el resultado con el valor esperado.
		assertEquals(valorEsperado, resultado);
	}
	
	@ParameterizedTest
	@CsvSource({"7, 5040",
				"10, 3628800",
				"5, 120"})
	//Prueba de método que toma un entero como parámetro y devuelve su factorial.
	void testFactorial(int a, int valorEsperado) {
		//Usamos el método para obtener el resultado.
		int resultado = Calculadora.Factorial(a);
		//Comparamos el resultado con el valor esperado.
		assertEquals(valorEsperado, resultado);
	}
}
