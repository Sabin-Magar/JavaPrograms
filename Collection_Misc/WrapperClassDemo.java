import java.util.Scanner;

public class WrapperClassDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();

        // Primitive to Wrapper Object (Boxing)
        Integer obj = Integer.valueOf(num);

        // Wrapper Object to Primitive (Unboxing)
        int value = obj.intValue();

        // Display results
        System.out.println("\nPrimitive value: " + num);
        System.out.println("Wrapper object: " + obj);
        System.out.println("Unboxed value: " + value);

        // Some wrapper class methods
        System.out.println("\nBinary: " + Integer.toBinaryString(num));

        System.out.println("Hexadecimal: " + Integer.toHexString(num));

        System.out.println("Maximum value of Integer: " + Integer.MAX_VALUE);

        sc.close();
    }
}