import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TaskI extends Remote {
    public void executeTask() throws RemoteException;
    public String getResult(int quantity, double price, int orderType) 
            throws RemoteException;
}
