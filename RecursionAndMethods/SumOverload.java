import java.util.Scanner;

public class SumOverload {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int x = sc.nextInt();

        System.out.print("Enter second number: ");
        int y = sc.nextInt();

        System.out.print("Enter third number: ");
        int z = sc.nextInt();

        System.out.println();
        System.out.println("Sum of two numbers = " + sum(x, y));
        System.out.println("Sum of three numbers = " + sum(x, y, z));

        sc.close();
    }
}