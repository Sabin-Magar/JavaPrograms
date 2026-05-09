import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int originalNumber = number;
        int remainder, sum = 0;
        int digits = String.valueOf(Math.abs(number)).length(); 
        
        int temp = Math.abs(number); 
        while (temp > 0) {
            remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }
        
        if (sum == Math.abs(originalNumber)) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
        sc.close();
    }
}