import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConversorTemperaturaTest {

    @Test
    void testCelsiusParaFahrenheitNormal() {
        assertEquals(32, ConversorTemperatura.celsiusParaFahrenheit(0), 0.001);
        assertEquals(212, ConversorTemperatura.celsiusParaFahrenheit(100), 0.001);
    }

    @Test
    void testFahrenheitParaCelsiusNormal() {
        assertEquals(0, ConversorTemperatura.fahrenheitParaCelsius(32), 0.001);
        assertEquals(100, ConversorTemperatura.fahrenheitParaCelsius(212), 0.001);
    }

    @Test
    void testValoresDeBorda() {
        assertEquals(-40, ConversorTemperatura.celsiusParaFahrenheit(-40), 0.001);
        assertEquals(-40, ConversorTemperatura.fahrenheitParaCelsius(-40), 0.001);
    }
}
