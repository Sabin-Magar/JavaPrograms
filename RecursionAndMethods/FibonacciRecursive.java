import java.util.Scanner;

public class FibonacciRecursive {
    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if(n==0){
            return 0;
        } else if (n == 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer n: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Fibonacci is not defined for negative numbers.");
        } else {
            System.out.print("Fibonacci sequence up to " + n + ": ");
            for (int i = 0; i <= n; i++) {
                System.out.print(fibonacci(i) + " ");
            }
            System.out.println();
            int result = fibonacci(n);
            System.out.println("The " + n + "th Fibonacci number is: " + result);
        }

        sc.close();
    }
}