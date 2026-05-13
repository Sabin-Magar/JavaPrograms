import java.util.Scanner;

// Interface
interface Shape {

    double area();
    double perimeter();
}

// Circle class
class Circle implements Shape {

    private double radius;

    // Constructor
    public Circle(double radius) {

        this.radius = radius;
    }

    // Area of circle
    @Override
    public double area() {

        return Math.PI * radius * radius;
    }

    // Perimeter of circle
    @Override
    public double perimeter() {

        return 2 * Math.PI * radius;
    }
}

// Rectangle class
class Rectangle implements Shape {

    private double length;
    private double breadth;

    // Constructor
    public Rectangle(double length,
                     double breadth) {

        this.length = length;
        this.breadth = breadth;
    }

    // Area of rectangle
    @Override
    public double area() {

        return length * breadth;
    }

    // Perimeter of rectangle
    @Override
    public double perimeter() {

        return 2 * (length + breadth);
    }
}

// Main class
public class Sample {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Circle input
        System.out.print( "Enter radius of circle: ");

        double radius = sc.nextDouble();

        // Rectangle input
        System.out.print(
            "Enter length of rectangle: "
        );

        double length = sc.nextDouble();

        System.out.print(
            "Enter breadth of rectangle: "
        );

        double breadth = sc.nextDouble();

        // Create objects
        Circle c = new Circle(radius);

        Rectangle r =
            new Rectangle(length, breadth);

        // Display results
        System.out.println("\nCircle");

        System.out.printf("Area = %.2f\n " , c.area());

        System.out.printf("Perimeter = %.2f\n " , c.perimeter());

        System.out.println("\nRectangle");

        System.out.println(
            "Area = " + r.area()
        );

        System.out.println(
            "Perimeter = " + r.perimeter()
        );

        sc.close();
    }
}