import java.util.Scanner;

class Complex {
    double real;
    double imag;

    // Constructor
    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Method to add two complex numbers
    public Complex add(Complex other) {
        return new Complex(this.real + other.real,this.imag + other.imag);
    }

    // Method to display complex number
    public String toString() {
        if (imag >= 0)
            return real + " + " + imag + "i";
        else
            return real + " - " + (-imag) + "i";
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input first complex number
        System.out.print("Enter real part of first complex number: ");
        double r1 = sc.nextDouble();

        System.out.print("Enter imaginary part of first complex number: ");
        double i1 = sc.nextDouble();

        // Input second complex number
        System.out.print("Enter real part of second complex number: ");
        double r2 = sc.nextDouble();

        System.out.print("Enter imaginary part of second complex number: ");
        double i2 = sc.nextDouble();

        // Create complex number objects
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        // Add complex numbers
        Complex sum = c1.add(c2);

        // Display result
        System.out.println("First complex number: " + c1);
        System.out.println("Second complex number: " + c2);
        System.out.println("Sum: " + sum);

        sc.close();
    }
}