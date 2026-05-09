import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        
        int[] array = new int[n];
        
        System.out.println("Enter " + n + " elements of an array:");
        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        
        Arrays.sort(array);
        
        System.out.println("Sorted array elements:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        sc.close();
    }
}