import java.util.Scanner;

public class DivideByZeroDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {

            // User input
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            // Division
            int result = a / b;

            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {

            // Handle divide by zero exception
            System.out.println("Error: Cannot divide by zero.");

        }

        sc.close();
    }
}