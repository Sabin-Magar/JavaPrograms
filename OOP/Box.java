import java.util.Scanner;

public class Box {
    private double width;
    private double height;
    private double depth;

    // public Box() {
    //     this.width = 0;
    //     this.height = 0;
    //     this.depth = 0;
    // }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // public double getWidth() {
    //     return width;
    // }

    // public void setWidth(double width) {
    //     this.width = width;
    // }

    // public double getHeight() {
    //     return height;
    // }

    // public void setHeight(double height) {
    //     this.height = height;
    // }

    // public double getDepth() {
    //     return depth;
    // }

    // public void setDepth(double depth) {
    //     this.depth = depth;
    // }

    public double getArea() {
        return 2 * (width * height +
                    width * depth +
                    height * depth);
    }

    // Method to calculate volume
    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter box width: ");
        double width = sc.nextDouble();

        System.out.print("Enter box height: ");
        double height = sc.nextDouble();

        System.out.print("Enter box depth: ");
        double depth = sc.nextDouble();

        Box box = new Box(width, height, depth);

        System.out.println("\nSurface Area = " + box.getArea());
        System.out.println("Volume = " + box.getVolume());

        sc.close();
    }
}
