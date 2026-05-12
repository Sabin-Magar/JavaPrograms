import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReadCharacterStream {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input file name
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {

            // Create FileReader object
            FileReader fr = new FileReader(fileName);

            int ch;

            System.out.println("\nFile Contents:\n");

            // Read character by character
            while ((ch = fr.read()) != -1) {

                System.out.print((char) ch);
            }

            // Close file
            fr.close();

        } catch (IOException e) {

            System.out.println("Error: File not found or cannot be read.");
        }

        sc.close();
    }
}