import java.rmi.Naming;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        try {
            // Lookup remote object
            AddInterface obj =
                (AddInterface) Naming.lookup("rmi://localhost/AddService");

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter first number: ");
            int a = sc.nextInt();

            System.out.print("Enter second number: ");
            int b = sc.nextInt();

            // Remote method call
            int result = obj.add(a, b);

            System.out.println("Sum = " + result);

        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}