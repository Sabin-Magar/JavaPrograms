// import java.util.Scanner;
// public class Number {
//     private int x;
//     private int y;
//     private int z;

//     // Constructor
//     public Number(int x, int y, int z) {
//         this.x = x;
//         this.y = y;
//         this.z = z;
//     }

//     // Member function to get the maximum number
//     public int getMax() {
//         if (x >= y && x >= z) {
//             return x;
//         } else if (y >= z) {
//             return y;
//         } else {
//             return z;
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         int a = sc.nextInt();

//         System.out.print("Enter second number: ");
//         int b = sc.nextInt();

//         System.out.print("Enter third number: ");
//         int c = sc.nextInt();
        
//         Number num = new Number(a,b,c);
//         System.out.println("Largest number is: " + num.getMax());

//         sc.close();
//     }
// }

import java.util.Scanner;

class Number {

    // Instance variables
    int x, y, z;

    // Constructor
    Number(int a, int b, int c) {
        x = a;
        y = b;
        z = c;
    }

    // Method to find largest number
    int getMax() {

        if (x >= y && x >= z) {
            return x;
        } else if (y >= x && y >= z) {
            return y;
        } else {
            return z;
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        // Create object
        Number obj = new Number(a, b, c);

        // Display largest number
        System.out.println("Largest number is: " + obj.getMax());

        sc.close();
    }
}