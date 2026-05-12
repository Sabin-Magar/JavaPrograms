import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

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

public class ObjectReadDemo {

    public static void main(String[] args) {

        try {

            // Open file stream
            FileInputStream fis =
                new FileInputStream("student.dat");

            // Create object input stream
            ObjectInputStream ois =
                new ObjectInputStream(fis);

            // Read object from file
            Student s = (Student) ois.readObject();

            // Display object data
            System.out.println("Student Details:");
            System.out.println("ID = " + s.id);
            System.out.println("Name = " + s.name);

            // Close streams
            ois.close();
            fis.close();

        } catch (IOException e) {

            System.out.println(
                "Error reading object from file."
            );

        } catch (ClassNotFoundException e) {

            System.out.println(
                "Class not found."
            );
        }
    }
}