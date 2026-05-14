import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class HelloImpl extends UnicastRemoteObject implements Hello {

    HelloImpl() throws RemoteException {
        super();
    }

    public String message() throws RemoteException {
        return "Hello from Server";
    }
}