import java.util.Scanner;

public class Swapper {
    private int x;
    private int y;

    public Swapper(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void swap() {
        int temp = x;
        x = y;
        y = temp;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter value of x: ");
        int x = sc.nextInt();

        System.out.print("Enter value of y: ");
        int y = sc.nextInt();

        Swapper swapper = new Swapper(x, y);

        System.out.println("Before swapping:");
        System.out.println("x = " + swapper.getX());
        System.out.println("y = " + swapper.getY());

        swapper.swap();

        System.out.println("After swapping:");
        System.out.println("x = " + swapper.getX());
        System.out.println("y = " + swapper.getY());

        sc.close();
    }
}
