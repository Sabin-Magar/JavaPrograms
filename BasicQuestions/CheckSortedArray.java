import java.util.Scanner;

public class CheckSortedArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if (size <= 0) {
            System.out.println("Array size must be a positive integer.");
            scanner.close();
            return;
        }

        int[] numbers = new int[size];
        System.out.println("Enter " + size + " elements of an array:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        boolean sorted = isSorted(numbers);
        if (sorted) {
            System.out.println("The array is sorted.");
        } else {
            System.out.println("The array is not sorted.");
        }
    }

    private static boolean isSorted(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
