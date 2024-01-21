import java.util.Scanner;

public class PasswordChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a password: ");
        String password = scanner.nextLine();

        boolean isValid = isPasswordValid(password);

        System.out.println(isValid ? 1 : 0);
    }

    public static boolean isPasswordValid(String password) {
        // Check length
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        char[] chars = password.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isWhitespace(c)) {
                hasSpecialChar = true;
            } else {
                return false;
            }
        }

        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }
}

