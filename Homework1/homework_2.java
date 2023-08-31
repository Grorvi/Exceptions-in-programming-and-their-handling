package Exceptions_in_programming.Homework1;

public class homework_2 {
    static class DivisionByZeroException extends Exception {
        public DivisionByZeroException(String message) {
            super(message);
        }
    }

    public static double divide_numbers(int a, int b) throws DivisionByZeroException {
        if (b == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        } else {
            return (double) a / b;
        }
    }

    public static void main(String[] args) {
        try {
            System.out.print("Введите первое число: ");
            int num1 = Integer.parseInt(System.console().readLine());
            System.out.print("Введите второе число: ");
            int num2 = Integer.parseInt(System.console().readLine());
            double result = divide_numbers(num1, num2);
            System.out.println("Результат деления: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Пожалуйста, введите целые числа.");
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }
    }
}
