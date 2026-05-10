import java.util.Scanner;

// Abstract class
abstract class Figure {

    // Instance variables
    double dim1;
    double dim2;

    // Constructor
    public Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

    // Abstract method
    abstract double getArea();
}

// Rectangle subclass
class Rectangle extends Figure {

    // Constructor
    public Rectangle(double length, double breadth) {
        super(length, breadth);
    }

    // Method to calculate rectangle area
    @Override
    double getArea() {
        return dim1 * dim2;
    }
}

// Triangle subclass
class Triangle extends Figure {

    // Constructor
    public Triangle(double base, double height) {
        super(base, height);
    }

    // Method to calculate triangle area
    @Override
    double getArea() {
        return 0.5 * dim1 * dim2;
    }
}

// Main class
public class FigureMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input rectangle dimensions
        System.out.println("Enter dimensions of Rectangle:");

        System.out.print("Length: ");
        double length = sc.nextDouble();

        System.out.print("Breadth: ");
        double breadth = sc.nextDouble();

        // Input triangle dimensions
        System.out.println("\nEnter dimensions of Triangle:");

        System.out.print("Base: ");
        double base = sc.nextDouble();

        System.out.print("Height: ");
        double height = sc.nextDouble();

        // Create objects
        Rectangle rect = new Rectangle(length, breadth);
        Triangle tri = new Triangle(base, height);

        // Display areas
        System.out.println("\nArea of Rectangle = "
                           + rect.getArea());

        System.out.println("Area of Triangle = "
                           + tri.getArea());

        sc.close();
    }
}