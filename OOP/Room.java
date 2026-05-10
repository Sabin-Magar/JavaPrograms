import java.util.Scanner;

public class Room {
    private double length;
    private double breadth;

    public Room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // public double getLength() {
    //     return length;
    // }

    // public void setLength(double length) {
    //     this.length = length;
    // }

    // public double getBreadth() {
    //     return breadth;
    // }

    // public void setBreadth(double breadth) {
    //     this.breadth = breadth;
    // }

    public double getArea() {
        return length * breadth;
    }
}

class MyRoom extends Room {
    private double height;

    public MyRoom(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    // public double getHeight() {
    //     return height;
    // }

    // public void setHeight(double height) {
    //     this.height = height;
    // }

    public double getVolume() {
        return getArea() * height;
    }

    public static void main(String[] args) {
        // MyRoom room1 = new MyRoom(12.5, 10.0, 8.0);
        // MyRoom room2 = new MyRoom(15.0, 11.5, 9.0);

        Scanner sc = new Scanner(System.in);

        // Input for first room
        System.out.println("Enter dimensions of Room 1:");

        System.out.print("Length: ");
        double l1 = sc.nextDouble();

        System.out.print("Breadth: ");
        double b1 = sc.nextDouble();

        System.out.print("Height: ");
        double h1 = sc.nextDouble();

        // Input for second room
        System.out.println("\nEnter dimensions of Room 2:");

        System.out.print("Length: ");
        double l2 = sc.nextDouble();

        System.out.print("Breadth: ");
        double b2 = sc.nextDouble();

        System.out.print("Height: ");
        double h2 = sc.nextDouble();

        // Create objects
        MyRoom room1 = new MyRoom(l1, b1, h1);
        MyRoom room2 = new MyRoom(l2, b2, h2);

        System.out.println("\nRoom 1");
        System.out.println("Area = " + room1.getArea());
        System.out.println("Volume = " + room1.getVolume());

        // Display details of Room 2
        System.out.println("\nRoom 2");
        System.out.println("Area = " + room2.getArea());
        System.out.println("Volume = " + room2.getVolume());

        sc.close();
    }
}


// javac Room.java
// java MyRoom