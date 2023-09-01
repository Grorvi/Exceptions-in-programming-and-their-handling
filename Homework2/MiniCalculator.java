package Exceptions-in-programming.Homework2;

import java.util.ArrayList;
import java.util.List;

public class MiniCalculator {
    private List<String> history;

    public MiniCalculator() {
        history = new ArrayList<>();
    }

    public int add(int a, int b) {
        int result = a + b;
        String operation = a + " + " + b + " = " + result;
        history.add(operation);
        return result;
    }

    public int subtract(int a, int b) {
        int result = a - b;
        String operation = a + " - " + b + " = " + result;
        history.add(operation);
        return result;
    }

    public int multiply(int a, int b) {
        int result = a * b;
        String operation = a + " * " + b + " = " + result;
        history.add(operation);
        return result;
    }

    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо.");
        }
        double result = a / b;
        String operation = a + " / " + b + " = " + result;
        history.add(operation);
        return result;
    }

    public double power(double a, double b) {
        double result = Math.pow(a, b);
        String operation = a + " ^ " + b + " = " + result;
        history.add(operation);
        return result;
    }

    public List<String> getHistory() {
        return history;
    }
}
