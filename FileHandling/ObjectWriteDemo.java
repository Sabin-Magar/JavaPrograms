import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

// Serializable class
class Student implements Serializable {

    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class ObjectWriteDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // consume newline

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Create object
        Student s = new Student(id, name);

        try {

            // Create file stream
            FileOutputStream fos =
                new FileOutputStream("student.dat");

            // Create object stream
            ObjectOutputStream oos =
                new ObjectOutputStream(fos);

            // Write object to file
            oos.writeObject(s);

            // Close streams
            oos.close();
            fos.close();

            System.out.println(
                "\nObject written to file successfully."
            );

        } catch (IOException e) {

            System.out.println(
                "Error writing object to file."
            );
        }

        sc.close();
    }
}