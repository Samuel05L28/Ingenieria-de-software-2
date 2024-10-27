package Taller_14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.RepeatedTest;

public class CalculadoraTest {

    static Calculadora calculadora;

    @BeforeAll
    public static void setup() {
        calculadora = new Calculadora();
    }

    @RepeatedTest(5)
    public void testSumar() {
        double resultado = calculadora.sumar(1, 2);
        Assertions.assertEquals(3, resultado, 0.0);
        Assertions.assertNotEquals(calculadora, new Calculadora());
        Assertions.assertTrue(resultado == 3);
        Assertions.assertFalse(resultado == 4);
    }

    @RepeatedTest(5)
    public void testRestar() {
        double resultado = calculadora.restar(1, 2);
        Assertions.assertEquals(-1, resultado, 0.0);
        Assertions.assertNotEquals(calculadora, new Calculadora());
        Assertions.assertTrue(resultado == -1);
        Assertions.assertFalse(resultado == 0);
    }

    @RepeatedTest(5)
    public void testMultiplicar() {
        double resultado = calculadora.mult(1, 2);
        Assertions.assertEquals(2, resultado, 0.0);
        Assertions.assertNotEquals(calculadora, new Calculadora());
        Assertions.assertTrue(resultado == 2);
        Assertions.assertFalse(resultado == 3);
    }

    @RepeatedTest(5)
    public void testDividir() {
        double resultado = calculadora.div(1, 2);
        Assertions.assertEquals(0.5, resultado, 0.0);
        Assertions.assertNotEquals(calculadora, new Calculadora());
        Assertions.assertTrue(resultado == 0.5);
        Assertions.assertFalse(resultado == 1);
    }
}
