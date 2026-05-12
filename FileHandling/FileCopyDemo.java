import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileCopyDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input source and destination file names
        System.out.print("Enter source file name: ");
        String sourceFile = sc.nextLine();

        System.out.print("Enter destination file name: ");
        String destinationFile = sc.nextLine();

        try {

            // Open source file
            FileInputStream fis =
                new FileInputStream(sourceFile);

            // Open destination file
            FileOutputStream fos =
                new FileOutputStream(destinationFile);

            int ch;

            // Copy contents
            while ((ch = fis.read()) != -1) {

                fos.write(ch);
            }

            // Close streams after copying
            fis.close();
            fos.close();

            System.out.println(
                "\nData copied successfully."
            );

            // Display contents of destination file
            FileInputStream displayFile =
                new FileInputStream(destinationFile);

            System.out.println(
                "\nContents of " + destinationFile + ":\n"
            );

            while ((ch = displayFile.read()) != -1) {

                System.out.print((char) ch);
            }

            // Close stream
            displayFile.close();

        } catch (IOException e) {

            System.out.println(
                "Error while handling file."
            );
        }

        sc.close();
    }
}