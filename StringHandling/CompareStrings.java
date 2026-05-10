import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        // Compare using equals() method
        if (first.equals(second)) {
            System.out.println("Strings are equal (content-wise).");
        } else {
            System.out.println("Strings are not equal (content-wise).");
        }

        // Compare using compareTo() method
        int result = first.compareTo(second);
        if (result == 0) {
            System.out.println("Strings are equal lexicographically.");
        } else if (result > 0) {
            System.out.println("First string is greater than second string.");
        } else {
            System.out.println("First string is less than second string.");
        }

        sc.close();
    }
}