public class Number {
    private int x;
    private int y;
    private int z;

    // Constructor
    public Number(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Member function to get the maximum number
    public int getMax() {
        if (x >= y && x >= z) {
            return x;
        } else if (y >= z) {
            return y;
        } else {
            return z;
        }
    }

    // Main method
    public static void main(String[] args) {
        Number num = new Number(10, 20, 15);
        System.out.println("Largest number: " + num.getMax());
    }
}