package Exceptions-in-programming.Homework1;

public class homework {
    static class InvalidNumberException extends Exception {
        public InvalidNumberException(String message) {
            super(message);
        }
    }

    public static void check_positive_number(int number) throws InvalidNumberException {
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        } else {
            System.out.println("Число корректно");
        }
    }

    public static void main(String[] args) {
        try {
            System.out.print("Введите число: ");
            int input_number = Integer.parseInt(System.console().readLine());
            check_positive_number(input_number);
        } catch (NumberFormatException e) {
            System.out.println("Пожалуйста, введите целое число.");
        } catch (InvalidNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}

