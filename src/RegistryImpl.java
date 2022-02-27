import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class RegistryImpl implements Registry_itf, Serializable {
    private String message;
    public ArrayList<String> ListClient = new ArrayList<>();

    public RegistryImpl(String s){
        message = s;
    }

    @Override
    public void register(Accounting_itf client) throws RemoteException {
        String name = ((InfoImpl)client).getName();
        System.out.println("Nouveau client :"+name);
        ListClient.add(name);
    }
}
