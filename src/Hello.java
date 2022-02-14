import java.rmi.*;

public interface Hello extends Remote {
	public String sayHello()  throws RemoteException;
	//public String sayHello(String clientName) throws RemoteException;

}