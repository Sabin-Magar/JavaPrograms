import java.util.Scanner;

public class AreaOverload {
    // Area of a circle: π * r^2
    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Area of a rectangle: length * breadth
    public static double area(double length, double breadth) {
        return length * breadth;
    }

    // Area of a triangle: 0.5 * base * height
    public static double area(double base, double height, boolean isTriangle) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Choose shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Rectangle");
            System.out.println("3. Triangle");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            choice = sc.nextInt();

            double result;
            switch (choice) {
                case 1:
                    System.out.print("Enter radius: ");
                    double radius = sc.nextDouble();
                    result = area(radius);
                    System.out.println("Area of circle is: " + result);
                    break;
                case 2:
                    System.out.print("Enter length: ");
                    double length = sc.nextDouble();
                    System.out.print("Enter breadth: ");
                    double breadth = sc.nextDouble();
                    result = area(length, breadth);
                    System.out.println("Area of rectangle is: " + result);
                    break;
                case 3:
                    System.out.print("Enter base: ");
                    double base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    double height = sc.nextDouble();
                    result = area(base, height, true);
                    System.out.println("Area of triangle is: " + result);
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
                    break;
            }

            System.out.println();
        } while (choice != 4);

        sc.close();
    }
}