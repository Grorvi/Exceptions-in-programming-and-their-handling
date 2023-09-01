package Exceptions-in-programming.Homework2;

public class Homework {
    public void verifyPassword(String password) throws Exception {
        if (password.length() < 8) {
            throw new Exception("Пароль должен быть не менее 8 символов");
        }

        boolean containsDigit = false;
        boolean containsUppercase = false;

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                containsDigit = true;
            } else if (Character.isUpperCase(c)) {
                containsUppercase = true;
            }

            if (containsDigit && containsUppercase) {
                return;
            }
        }

        throw new Exception("Пароль должен содержать хотя бы одну цифру и хотя бы одну заглавную букву");
    }

}
