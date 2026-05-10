// public class MultipleCatchDemo {
//     public static void main(String[] args) {
//         int[] numbers = {10, 0, 5};
//         String text = null;

//         try {
//             int result = numbers[0] / numbers[1];
//             System.out.println("Division result: " + result);
//             System.out.println("String length: " + text.length());
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException caught: " + e.getMessage());
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException caught: " + e.getMessage());
//         }

//         System.out.println("Program continues after multiple catch blocks.");
//     }
// }

import java.util.Scanner;

public class MultipleCatchDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {10, 20, 30, 40, 50};

        try {

            // Input numbers
            System.out.print("Enter numerator: ");
            int a = sc.nextInt();

            System.out.print("Enter denominator: ");
            int b = sc.nextInt();

            // Division
            int result = a / b;

            System.out.println("Result = " + result);

            // Input array index
            System.out.print("Enter array index: ");
            int index = sc.nextInt();

            // Access array element
            System.out.println("Element = " + arr[index]);

        }

        // Catch divide by zero exception
        catch (ArithmeticException e) {

            System.out.println("Error: Cannot divide by zero.");
        }

        // Catch array index exception
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Error: Array index out of bounds.");
        }

        // Catch invalid input exception
        catch (Exception e) {

            System.out.println("Error: Invalid input.");
        }

        sc.close();
    }
}