import java.util.Scanner;

public class LargestOfFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter four different numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int maxAB = (a > b) ? a : b;
        int maxCD = (c > d) ? c : d;
        int largest = (maxAB > maxCD) ? maxAB : maxCD;

        System.out.println("The largest number among " + a + ", " + b + ", " + c + " and " + d + " is: " + largest);
        sc.close();
    }
}