public class FahrenheitCelciusConverter {
    public static double toCelcius(double fahrenheit) {
        if (fahrenheit < -459.67) {
            throw new IllegalArgumentException("Valor abaixo do zero absoluto.");
        }
        return (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit(double celcius) {
        if (celcius < -273.15) {
            throw new IllegalArgumentException("Valor abaixo do zero absoluto.");
        }
        return celcius * 9 / 5 + 32;
    }
}
