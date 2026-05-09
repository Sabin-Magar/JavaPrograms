import java.util.Scanner;

public class PowerRecursive {
    // Recursive method to calculate x raised to the power y
    public static double power(double x, int y) {
        if (y == 0) {
            return 1;
        } else if (y < 0) {
            return 1 / power(x, -y);
        } else {
            return x * power(x, y - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base x: ");
        double x = sc.nextDouble();
        System.out.print("Enter the exponent y: ");
        int y = sc.nextInt();

        double result = power(x, y);
        System.out.println(x + " to the power " + y + " is: " + result);
        sc.close();
    }
}