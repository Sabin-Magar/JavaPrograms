import java.util.Scanner;

// Student class
class Student {

    // Private member variables
    private String name;
    private double percentage;

    // Method to set values
    public void setData(String name,
                        double percentage) {

        this.name = name;
        this.percentage = percentage;
    }

    // Method to display values
    public void display() {

        System.out.printf(
            "Name: %s, Percentage: %.2f%%\n",
            name,
            percentage
        );
    }

    // Getter methods
    public String getName() {

        return name;
    }

    public double getPercentage() {

        return percentage;
    }
}

// Main class
public class StudentDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Array of 5 students
        Student[] students =
            new Student[5];

        // Input student details
        for (int i = 0; i < 5; i++) {

            students[i] = new Student();

            System.out.println(
                "\nEnter details of Student "
                + (i + 1)
            );

            System.out.print("Enter name: ");
            String name = sc.nextLine();

            System.out.print(
                "Enter percentage: "
            );

            double percentage =
                sc.nextDouble();

            sc.nextLine(); // consume newline

            students[i].setData(
                name,
                percentage
            );
        }

        // Display all students
        System.out.println(
            "\nStudent Records:"
        );

        for (int i = 0; i < 5; i++) {

            students[i].display();
        }

        // Find highest percentage
        Student topStudent =
            students[0];

        for (int i = 1; i < 5; i++) {

            if (students[i]
                    .getPercentage()
                > topStudent
                    .getPercentage()) {

                topStudent =
                    students[i];
            }
        }

        // Display topper
        System.out.println(
            "\nStudent with Highest Percentage:"
        );

        System.out.println(
            "Name: "
            + topStudent.getName()
        );

        System.out.printf(
            "Percentage: %.2f%%\n",
            topStudent.getPercentage()
        );

        sc.close();
    }
}