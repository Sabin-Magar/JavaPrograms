import java.util.Scanner;

public class ReplaceCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = sc.nextLine();

        System.out.print("Enter character to replace: ");
        char oldChar = sc.next().charAt(0);

        System.out.print("Enter replacement character: ");
        char newChar = sc.next().charAt(0);

        String replaced = original.replace(oldChar, newChar);
        System.out.println("Original string: " + original);
        System.out.println("Replaced string: " + replaced);

        sc.close();
    }
}