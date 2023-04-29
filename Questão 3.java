import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Calculator {
    public double add(double number1, double number2) {
        return number1 + number2;
    }
}

public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 50);
        Assertions.assertEquals(60, result);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CalculatorTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("Todos os testes passaram com sucesso.");
        } else {
            System.out.println("Ocorreram " + result.getFailureCount() + " Falhas.");
        }
    }
}
