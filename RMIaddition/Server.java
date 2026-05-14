import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class Server {

    public static void main(String[] args) {

        try {
            // Start RMI Registry
            LocateRegistry.createRegistry(1099);

            // Create remote object
            AddImpl obj = new AddImpl();

            // Bind object with name
            Naming.rebind("rmi://localhost/AddService", obj);

            System.out.println("Server is running...");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}