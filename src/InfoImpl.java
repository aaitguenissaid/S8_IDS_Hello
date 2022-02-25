import java.io.Serializable;
import java.rmi.RemoteException;

public class InfoImpl implements Info_itf, Serializable {
    private String clientName;

    public InfoImpl(String n){
        clientName=n;
    }

    @Override
    public String getName() throws RemoteException {
        return this.clientName;
    }
}
