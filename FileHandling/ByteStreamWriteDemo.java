import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ByteStreamWriteDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input file name
        System.out.print("Enter file name: ");
        String fileName = sc.nextLine();

        // Input text
        System.out.print("Enter text to write into file: ");
        String text = sc.nextLine();

        try {

            // Create FileOutputStream object
            FileOutputStream fos =
                new FileOutputStream(fileName);

            // Convert string to bytes
            byte[] data = text.getBytes();

            // Write bytes to file
            fos.write(data);

            // Close output stream
            fos.close();

            System.out.println("\nText written to file successfully.");

            // Read file contents
            FileInputStream fis =
                new FileInputStream(fileName);

            int ch;

            System.out.println("\nContents of file:");

            // Read byte by byte
            while ((ch = fis.read()) != -1) {

                System.out.print((char) ch);
            }

            // Close input stream
            fis.close();

        } catch (IOException e) {

            System.out.println("Error handling file.");
        }

        sc.close();
    }
}