import java.io.Serializable;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class RegistryImpl implements Registry_itf, Serializable {
    private String message;
    public ArrayList<Accounting_itf> ListClient = new ArrayList<>();

    public RegistryImpl(String s){
        message = s;
    }

    @Override
    public void register(Accounting_itf client) throws RemoteException {
        System.out.println("Nouveau client :"+((InfoImpl)client).getName());
        ListClient.add(client);
    }
}
