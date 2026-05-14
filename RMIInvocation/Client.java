import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try {
            // Lookup remote object
            Calculator obj =
                (Calculator) Naming.lookup("rmi://localhost/CalcService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Invoke remote method
            int result = obj.multiply(a, b);

            System.out.println("Multiplication Result = " + result);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}