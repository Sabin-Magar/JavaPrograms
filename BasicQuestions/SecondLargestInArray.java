import java.util.Scanner;
public class SecondLargestInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input array size
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        // Input array elements
        System.out.println("Enter " + size + " elements of an array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Initialize largest and second largest
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        // Find largest and second largest
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }
        
        // Display result
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("No second largest element found.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
        
        sc.close();
    }
}
