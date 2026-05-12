import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamReadDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input file name
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        try {

            // Create FileInputStream object
            FileInputStream fis =
                new FileInputStream(fileName);

            int ch;

            System.out.println("\nFile Contents:\n");

            // Read byte by byte
            while ((ch = fis.read()) != -1) {

                System.out.print((char) ch);
            }

            // Close stream
            fis.close();

        } catch (IOException e) {

            System.out.println(
                "Error: File not found or cannot be read."
            );
        }

        sc.close();
    }
}