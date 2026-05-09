import java.util.Scanner;

public class MultipleCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer (m): ");
        int m = sc.nextInt();

        System.out.print("Enter the second integer (n): ");
        int n = sc.nextInt();

        sc.close();

        if (n == 0) {
            System.out.println("Cannot check if " + m + " is a multiple of 0 (division by zero).");
        } else if (m % n == 0) {
            System.out.println(m + " is a multiple of " + n + ".");
        } else {
            System.out.println(m + " is not a multiple of " + n + ".");
        }
    }
}