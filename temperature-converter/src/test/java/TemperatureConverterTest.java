import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {
    private final TemperatureConverter temperatureConverter = new TemperatureConverter();

    @Test
    void fahrenheitToCelsius() {
        assertEquals(-10, temperatureConverter.fahrenheitToCelsius(14));
        assertEquals(20, temperatureConverter.fahrenheitToCelsius(68));
        assertEquals(0, temperatureConverter.fahrenheitToCelsius(32));
    }

    @Test
    void celsiusToFahrenheit() {
        assertEquals(14, temperatureConverter.celsiusToFahrenheit(-10));
        assertEquals(68, temperatureConverter.celsiusToFahrenheit(20));
        assertEquals(32, temperatureConverter.celsiusToFahrenheit(0));
    }

    @Test
    void isExtremeTemperature() {
        assertTrue(temperatureConverter.isExtremeTemperature(-56));
        assertFalse(temperatureConverter.isExtremeTemperature(0));
        assertFalse(temperatureConverter.isExtremeTemperature(-37));
        assertTrue(temperatureConverter.isExtremeTemperature(59));
    }
}