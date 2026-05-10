import java.util.Scanner;

public class ComparePortionStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String first = sc.nextLine();

        System.out.print("Enter second string: ");
        String second = sc.nextLine();

        System.out.print("Enter starting index for first string: ");
        int start1 = sc.nextInt();

        System.out.print("Enter starting index for second string: ");
        int start2 = sc.nextInt();

        System.out.print("Enter number of characters to compare: ");
        int length = sc.nextInt();

        boolean result = first.regionMatches(start1, second, start2, length);
        if (result) {
            System.out.println("The specified portions are equal.");
        } else {
            System.out.println("The specified portions are not equal.");
        }

        sc.close();
    }
}