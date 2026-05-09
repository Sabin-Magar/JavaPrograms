import java.util.Scanner;

public class LargestInArray {
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
        System.out.print("Enter " + size + " numbers : ");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        scanner.close();

        int largest = findLargest(numbers);
        System.out.println("Largest element in the array is: " + largest);
    }

    private static int findLargest(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
}
