import java.rmi.Naming;

public class Client {

    public static void main(String[] args) {

        try {
            // Lookup remote object
            Hello obj = (Hello) Naming.lookup("rmi://localhost/HelloService");

            // Call remote method
            String msg = obj.message();

            System.out.println("Message from Server: " + msg);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}