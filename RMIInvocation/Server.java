import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {

        try {
            // Start RMI Registry
            LocateRegistry.createRegistry(1099);

            // Create remote object
            CalculatorImpl obj = new CalculatorImpl();

            // Bind object to registry
            Naming.rebind("rmi://localhost/CalcService", obj);

            System.out.println("Server started successfully...");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}