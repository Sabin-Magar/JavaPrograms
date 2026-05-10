// public class NullExceptionDemo {
//     public static void main(String[] args) {
//         String str = null;
//         try {
//             System.out.println("Length of string: " + str.length());
//         } catch (NullPointerException e) {
//             System.out.println("NullPointerException caught: " + e.getMessage());
//         }
//         System.out.println("Program continues after exception handling.");
//     }
// }


import java.util.Scanner;

public class NullExceptionDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = null;

        try {

            // User choice
            System.out.print("Do you want to enter a string? (yes/no): ");
            String choice = sc.nextLine();

            // If user enters yes, take string input
            if (choice.equalsIgnoreCase("yes")) {

                System.out.print("Enter a string: ");
                text = sc.nextLine();
            }

            // Attempt to access string length
            System.out.println("Length = " + text.length());

        } catch (NullPointerException e) {

            // Handle exception
            System.out.println("Error: Null pointer exception occurred.");
        }

        sc.close();
    }
}