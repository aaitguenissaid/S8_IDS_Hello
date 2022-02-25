import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Hello2 extends Remote{
    public String sayHello(Accounting_itf a)  throws RemoteException;
}
