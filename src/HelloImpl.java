
import java.rmi.*;

public class HelloImpl implements Hello {

	private String message;
 
	public HelloImpl(String s) {
		message = s ;
	}

	public String sayHello() throws RemoteException {
		return message ;
	}

	@Override
	public String sayHello(String clientName) throws RemoteException {
		return clientName+": "+message;
	}

	@Override
	public String sayHello(Info_itf client) throws RemoteException {
		return client.getName()+": "+message;
	}
}

