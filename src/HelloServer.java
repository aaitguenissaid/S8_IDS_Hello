
import java.rmi.*; 
import java.rmi.server.*; 
import java.rmi.registry.*;
import java.util.ArrayList;

public class HelloServer {
  public static void  main(String [] args) {
	  try {
		  // Create a Hello remote object
		  RegistryImpl r = new RegistryImpl("Hello Registry !");
	    HelloImpl h = new HelloImpl ("Hello world !");
		Hello2Impl h2 = new Hello2Impl("Hello world 2 !", r);
		Registry_itf r_stub = (Registry_itf) UnicastRemoteObject.exportObject(r, 0);
	    Hello h_stub = (Hello) UnicastRemoteObject.exportObject(h, 0);
		Hello2 h_stub2 = (Hello2) UnicastRemoteObject.exportObject(h2, 0);

	    // Register the remote object in RMI registry with a given identifier
	    Registry registry= LocateRegistry.getRegistry();
	    registry.rebind("HelloService", h_stub);
		registry.rebind("HelloService2", h_stub2);
		registry.rebind("RegistryService", r_stub);

	    System.out.println ("Server ready");

	  } catch (Exception e) {
		  System.err.println("Error on server :" + e) ;
		  e.printStackTrace();
	  }
  }
}
