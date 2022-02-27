import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.UnicastRemoteObject;

public class HelloClient {
  public static void main(String [] args) {
	
	try {
	  if (args.length < 2) {
	   System.out.println("Usage: java HelloClient <rmiregistry host> <name>");
	   return;}

	String host = args[0];
	  String name = args[1];

	// Get remote object reference
	Registry registry = LocateRegistry.getRegistry(host); 
	Hello h = (Hello) registry.lookup("HelloService");
	Hello2 h2 = (Hello2) registry.lookup("HelloService2");
	Registry_itf r = (Registry_itf) registry.lookup("RegistryService");

	// Remote method invocation
		InfoImpl i = new InfoImpl(name);
		String res = h.sayHello(name);
	System.out.println(res);

	r.register(i);
	String res2 = h2.sayHello(i);
	System.out.println(res2);

	for(int j=0; j < 10; j++){
		res2 = h2.sayHello(i);
		System.out.println(res2);
	}

	} catch (Exception e)  {
		System.err.println("Error on client: " + e);
	}
  }
}