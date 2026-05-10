import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older. Given age: " + age);
        }
        System.out.println("Age is valid: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Custom exception caught: " + e.getMessage());
        }
        sc.close();
    }
}