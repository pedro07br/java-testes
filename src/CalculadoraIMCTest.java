import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraIMCTest {

    @Test
    void testAbaixoDoPeso() {
        double imc = CalculadoraIMC.calcularIMC(50, 1.75);
        assertEquals("Abaixo do peso", CalculadoraIMC.classificarIMC(imc));
    }

    @Test
    void testPesoNormal() {
        double imc = CalculadoraIMC.calcularIMC(68, 1.75);
        assertEquals("Peso normal", CalculadoraIMC.classificarIMC(imc));
    }

    @Test
    void testSobrepeso() {
        double imc = CalculadoraIMC.calcularIMC(80, 1.75);
        assertEquals("Sobrepeso", CalculadoraIMC.classificarIMC(imc));
    }

    @Test
    void testObesidade() {
        double imc = CalculadoraIMC.calcularIMC(100, 1.75);
        assertEquals("Obesidade", CalculadoraIMC.classificarIMC(imc));
    }
}
