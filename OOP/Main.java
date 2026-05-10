// 32.Create a Person class with private instance variables for person’s name and birth date. Add appropriate functions for these variables. Then create a subclass CollegeGraduate with private instance variables for the student’s GPA and year of graduation and appropriate functions for these variables. Don’t forget to include appropriate constructor constructors for your classes. Then define main () method that demonstrates your classes.


import java.util.Scanner;

// Superclass
class Person {

    // Private instance variables
    private String name;
    private String birthDate;

    // Constructor
    public Person(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for birth date
    public String getBirthDate() {
        return birthDate;
    }

    // Setter for birth date
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
}

// Subclass
class CollegeGraduate extends Person {

    // Private instance variables
    private double gpa;
    private int graduationYear;

    // Constructor
    public CollegeGraduate(String name, String birthDate,
                           double gpa, int graduationYear) {

        super(name, birthDate);

        this.gpa = gpa;
        this.graduationYear = graduationYear;
    }

    // Getter for GPA
    public double getGpa() {
        return gpa;
    }

    // Setter for GPA
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // Getter for graduation year
    public int getGraduationYear() {
        return graduationYear;
    }

    // Setter for graduation year
    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }
}

// Main class
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter birth date: ");
        String birthDate = sc.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();

        System.out.print("Enter graduation year: ");
        int year = sc.nextInt();

        // Create object
        CollegeGraduate student =
            new CollegeGraduate(name, birthDate, gpa, year);

        // Display details
        System.out.println("\nStudent Details");
        System.out.println("Name: " + student.getName());
        System.out.println("Birth Date: " + student.getBirthDate());
        System.out.println("GPA: " + student.getGpa());
        System.out.println("Graduation Year: " + student.getGraduationYear());

        sc.close();
    }
}