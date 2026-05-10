// public class ArrayIndexBoundsDemo {
//     public static void main(String[] args) {
//         int[] arr = {1, 2, 3, 4, 5};
//         try {
//             System.out.println("Accessing element at index 10: " + arr[10]);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
//         }
//         System.out.println("Program continues after exception handling.");
//     }
// }

import java.util.Scanner;

public class ArrayIndexBoundsDemo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        // Input array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        try {

            // User input for index
            System.out.print("Enter index to access: ");
            int index = sc.nextInt();

            // Access array element
            System.out.println("Element = " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {

            // Handle exception
            System.out.println("Error: Array index is out of bounds.");
        }

        sc.close();
    }
}