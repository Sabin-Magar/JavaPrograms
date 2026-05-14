import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject
        implements Calculator {

    CalculatorImpl() throws RemoteException {
        super();
    }

    public int multiply(int a, int b) throws RemoteException {
        return a * b;
    }
}