import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TaskI extends Remote {
    public void executeTask() throws RemoteException;
    public void getResult() throws RemoteException;
}
